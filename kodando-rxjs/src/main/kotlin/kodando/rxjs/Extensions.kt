@file:Suppress("UnsafeCastFromDynamic")

package kodando.rxjs

inline fun <T> Observable<T>.subscribe(observer: Observer<T>): Unsubscribable {
    return this.asDynamic().subscribe(observer)
}

inline fun <T> Observable<T>.subscribeBy(
    noinline next: NextHandler<T>? = undefined,
    noinline error: ErrorHandler? = undefined,
    noinline complete: CompleteHandler? = undefined): Unsubscribable {
    return this.asDynamic().subscribe(next, error, complete)
}

