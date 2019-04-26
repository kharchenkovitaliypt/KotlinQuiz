//
// Created by Vitaliy on 2019-04-24.
// Copyright (c) 2019 ___FULLUSERNAME___. All rights reserved.
//

import Foundation

public class SwiftData : NSObject {
    
    @objc public var items = [45, 90]
    
    @objc public func hello(
            name: String,
            payload: Int,
            block: () -> Void
    ) -> String {
        return "Hello \(name)(\(payload)!!"
    }
}

@objc
public extension SwiftData {

    @objc public func textItems() -> [String] {
        return items.map { String($0) }
    }

    @objc public func setTextItems(textItems: [String]) {
        items = textItems.map { Int($0)! }
    }

    @objc public var textItemsVar: [String] {
        get {
            return items.map { String($0) }
        }
        set(newValue) {
            items = newValue.map { Int($0)! }
        }
    }
}
