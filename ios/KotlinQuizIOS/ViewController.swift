//
//  ViewController.swift
//  KotlinQuizIOS
//
//  Created by Vitaliy on 4/9/19.
//  Copyright © 2019 Test. All rights reserved.
//

import UIKit
import CommonCode

class ViewController: UIViewController {
    
    //MARK: Properties
    @IBOutlet weak var question: UILabel!
    @IBOutlet weak var totalPoints: UITextField!
    @IBOutlet weak var input: UITextView!
    @IBOutlet weak var nextBtn: UIButton!
    
    var selectedAnswer: OptAnswer?
    
    var viewModel: QuizViewModel!
    
    override func viewDidLoad() {
        super.viewDidLoad()

        let data = MyData(value: 5)

        print("MyData: \(data)")

        SuspendJobKt.randomText(sid: "12345")
        
        let quizService = QuizService(assetService: AssetService())
        self.viewModel = QuizViewModel(quizService: quizService)
        
        viewModel.totalPointsLiveData.observe {
            self.totalPoints.text = "Total points: \($0)"
            return KotlinUnit()
        }
        viewModel.questionStateLiveData.observe {
            let state = $0
            switch state {
            case let valueState as QuestionState.Value:
                self.showQuestion(question: valueState.value)
            case let doneState as QuestionState.Done:
                self.showDone(totalPoints: doneState.totalPoints)
            default: break
            }
            return KotlinUnit()
        }
    }
    
    func showQuestion(question: Question) {
        self.question.text = question.text
        
        switch question {
        case is InputQuestion:
            input.text = ""
        case let optQuestion as OptQuestion:
            let answers = optQuestion.answers
            selectedAnswer = answers.randomElement()!
            input.text = answers
                .map { "- " + $0.content + ($0 === selectedAnswer ? "*" : "") }
                .joined(separator: "\n")
        default: break
        }
    }
    
    func showDone(totalPoints: Int64) {
        self.totalPoints.center = self.view.center
        self.input.isHidden = true
        self.question.text = ""
        self.nextBtn.isHidden = true
    }
    
    //MARK: Actions
    @IBAction func onNext(_ sender: UIButton) {
        let question = (viewModel!.questionStateLiveData.data as! QuestionState.Value).value
        switch question {
        case is InputQuestion:
            if let text = input.text, !text.isEmpty {
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

