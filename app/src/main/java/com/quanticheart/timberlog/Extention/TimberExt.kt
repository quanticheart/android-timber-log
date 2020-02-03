/*
 *
 *  *                                     /@
 *  *                      __        __   /\/
 *  *                     /==\      /  \_/\/
 *  *                   /======\    \/\__ \__
 *  *                 /==/\  /\==\    /\_|__ \
 *  *              /==/    ||    \=\ / / / /_/
 *  *            /=/    /\ || /\   \=\/ /
 *  *         /===/   /   \||/   \   \===\
 *  *       /===/   /_________________ \===\
 *  *    /====/   / |                /  \====\
 *  *  /====/   /   |  _________    /      \===\
 *  *  /==/   /     | /   /  \ / / /         /===/
 *  * |===| /       |/   /____/ / /         /===/
 *  *  \==\             /\   / / /          /===/
 *  *  \===\__    \    /  \ / / /   /      /===/   ____                    __  _         __  __                __
 *  *    \==\ \    \\ /____/   /_\ //     /===/   / __ \__  ______  ____ _/ /_(_)____   / / / /__  ____ ______/ /_
 *  *    \===\ \   \\\\\\\/   ///////     /===/  / / / / / / / __ \/ __ `/ __/ / ___/  / /_/ / _ \/ __ `/ ___/ __/
 *  *      \==\/     \\\\/ / //////       /==/  / /_/ / /_/ / / / / /_/ / /_/ / /__   / __  /  __/ /_/ / /  / /_
 *  *      \==\     _ \\/ / /////        |==/   \___\_\__,_/_/ /_/\__,_/\__/_/\___/  /_/ /_/\___/\__,_/_/   \__/
 *  *        \==\  / \ / / ///          /===/
 *  *        \==\ /   / / /________/    /==/
 *  *          \==\  /               | /==/
 *  *          \=\  /________________|/=/
 *  *            \==\     _____     /==/
 *  *           / \===\   \   /   /===/
 *  *          / / /\===\  \_/  /===/
 *  *         / / /   \====\ /====/
 *  *        / / /      \===|===/
 *  *        |/_/         \===/
 *  *                       =
 *  *
 *  * Copyright(c) Developed by John Alves at 2020/2/2 at 11:38:18 for quantic heart studios
 *
 */

package com.quanticheart.timberlog.Extention

import android.app.Application
import android.content.Context
import com.quanticheart.timberlog.BuildConfig
import com.quanticheart.timberlog.timberCuston.CustomDebugTree
import com.quanticheart.timberlog.timberCuston.CustomReleaseTree
import timber.log.Timber

fun Application.plantTimberTree() {
    if (BuildConfig.DEBUG) {
        Timber.plant(CustomDebugTree())
    } else {
        Timber.plant(CustomReleaseTree())
    }
}

fun Context.logW(msg: String) = Timber.w(msg)
fun Context.logW(tag: String, msg: String) = Timber.tag(tag).w(msg)

fun Context.logE(msg: String) = Timber.e(msg)
fun Context.logE(tag: String, msg: String) = Timber.tag(tag).e(msg)

fun Context.logI(msg: String) = Timber.i(msg)
fun Context.logI(tag: String, msg: String) = Timber.tag(tag).i(msg)

fun Context.logD(msg: String) = Timber.d(msg)
fun Context.logD(tag: String, msg: String) = Timber.tag(tag).d(msg)

fun Context.logThrowable(t: Throwable) = Timber.e(t)
fun Context.logThrowable(tag: String, t: Throwable) = Timber.tag(tag).e(t)

fun Throwable.showMsg() = Timber.e(this)
fun Throwable.showMsg(tag: String) = Timber.tag(tag).e(this)