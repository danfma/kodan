@file:Suppress("unused")

package kodando.jest

import kotlin.js.Promise


@JsName("describe")
external fun describe(name: String, handler: () -> Unit)

@JsName("test")
external fun test(name: String, handler: () -> Unit)

@JsName("test")
external fun testAsync(name: String, handler: () -> Promise<*>)

@JsName("it")
external fun it(description: String, expectationHandler: () -> Unit)

@JsName("it")
external fun itAsync(description: String, expectationHandler: () -> Promise<*>)
