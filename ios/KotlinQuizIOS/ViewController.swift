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
    
    var viewModel: QuizViewModel?
    
    override func viewDidLoad() {
        super.viewDidLoad()
        
        let quizService = QuizService(assetService: AssetService())
        self.viewModel = QuizViewModel(quizService: quizService)
        
        viewModel!.totalPointsLD.observe {
            let points = $0 as! KotlinLong
            self.totalPoints.text = "Total points: \(points)"
            return KotlinUnit()
        }
        
        viewModel!.questionLD.observe {
            self.question.text = $0?.text
            return KotlinUnit()
        }
    }
    
    //MARK: Actions
    @IBAction func onNext(_ sender: UIButton) {
        viewModel!.processAnswer(answer: "Funny")
    }
}

