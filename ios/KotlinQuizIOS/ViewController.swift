import UIKit
import CommonCode

class Data {
    var value: Int

    init(value: Int) {
        self.value = value
    }
}

extension Data {

    func process(item: NSNumber) {
        let oldValue = value
        self.value += item.intValue
        print("Data.process(item: \(item)) oldValue: \(oldValue), newValue: \(value)")
    }
}

class ViewController: UIViewController {
    
    //MARK: Properties
    @IBOutlet weak var questionView: UILabel!
    @IBOutlet weak var totalPointsView: UITextField!
    @IBOutlet weak var textView: UITextView!
    @IBOutlet weak var nextBtn: UIButton!
    
    var selectedAnswer: OptAnswer?
    var viewModel: QuizViewModel!
    
    override func viewDidLoad() {
        super.viewDidLoad()
//        TestKt.runTest(sid: "12345")
        
        let quizService = QuizService(assetService: AssetServiceImpl())
        self.viewModel = QuizViewModel(quizService: quizService)

        let data = Data(value: 48)
        viewModel.totalPoints.observe(callback: data.process)

        viewModel.totalPoints.observe { points in
            self.totalPointsView.text = "Total points: \(points)"
        }

        viewModel.questionState.observe { state in
            switch state {
            case let valueState as QuestionState.Value:
                self.showQuestion(question: valueState.value)
            case let doneState as QuestionState.Done:
                self.showDone(totalPoints: doneState.totalPoints)
            default: break
            }
        }
    }
    
    func showQuestion(question: Question) {
        self.questionView.text = question.text
        
        switch question {
        case is InputQuestion:
            textView.text = ""
        case let optQuestion as OptQuestion:
            let answers = optQuestion.answers
            selectedAnswer = answers.randomElement()!
            textView.text = answers
                .map { "- " + $0.content + ($0 === selectedAnswer ? "*" : "") }
                .joined(separator: "\n")
        default: break
        }
    }
    
    func showDone(totalPoints: Int64) {
        self.totalPointsView.center = self.view.center
        self.textView.isHidden = true
        self.questionView.text = ""
        self.nextBtn.isHidden = true
    }
    
    //MARK: Actions
    @IBAction func onNext(_ sender: UIButton) {
        let question = (viewModel!.questionState.value() as! QuestionState.Value).value
        switch question {
        case is InputQuestion:
            if let text = textView.text, !text.isEmpty {
                viewModel.processAnswer(answer: text)
            } else {
                showAlert(msg: "Please input something")
            }
        case is OptQuestion:
            viewModel.processAnswer(answer_: selectedAnswer!)
        default: break
        }
    }
    
    func showAlert(msg: String) {
        let alert = UIAlertController(title: "Alert", message: msg, preferredStyle: .alert)
        alert.addAction(UIAlertAction(title: "OK", style: .default))
        self.present(alert, animated: true, completion: nil)
    }
}

