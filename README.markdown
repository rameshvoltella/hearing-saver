#Hearing Saver Readme

Thanks for checking out **Hearing Saver**. I wrote this app because many times I drive into work listening to music at full volume, only to end up hurting my ears when I forget to turn the colume back down for my headphones at my desk. If this happens to you, I hope this app will be able to ease your pain. If you notice something wrong, please tell me and I will try and fix it; or you can even take a look at the code and submit a patch yourself. 

The app is available to download from the [Android Market](https://market.android.com/details?id=com.jakebasile.android.hearingsaver).

##How To Use

I've tried to keep this app very simple, to match its very simple purpose. When you first download the app, or update it, you must open it at least once to configure it and to start the background service that allows it to work. You can alternatively restart your phone, although you don't have to, because the app will start itself at boot after it is installed.

The configuration has two sliders and two checkboxes: 
* The sliders control what volume will be set when the headphone jack is plugged in and when it is pulled out. 
* The first checkbox controls whether or not the app will mute the ringer and notifications when the headphone jack is plugged in; if it is enabled, the app should return your ringer to what it was before it was muted once the headphones are unplugged.
* The second checkbox controls whether or not Bluetooth audio devices will trigger Hearing Saver.

After setting it up, theres nothing more you need to do. The app will run a small service in the background and set your volume presets when the headset is plugged in or unplugged.

##Issues

To report an issue, you can create a new [issue](https://github.com/jakebasile/hearing-saver/issues) - after checking to see that it isn't already there. I will try to fix it soon, but please consider that this project is not my day job. If you really want something fixed and you know how to code, you can try doing it yourself and getting into contact with me to add in your changes.

