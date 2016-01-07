This application runs in Android space and is responsible for desktop integration on the android side.

Currently it contains:
 - the part of SystemUI that draws the navigation bar (back buttons) so systemUI can be removed
 - a new notification intent receiver

 As it uses private API permissions it must be built with android frameworks and signed with the same key as the libraries.