# Cordova Firebase Plugin
Cordova plugin support firebase 
## Support OS
    - Android -> yes
    - iOS -> No
## Prepare 

First you need setup firebase project, then you will have file `google-services.json`. Please copy it to root folder.
Next step you need insert into `config.xml`. Remember change value by info your project.

    <platform name="android">
        <config-file target="res/values/strings.xml" parent="/*">
            <string name="google_app_id">xxxxxxxx</string>
            <string name="server_client_id">xxxxxxxxxx</string>
        </config-file> 
    </platform>

## How to install? 

    cordova plugin add https://github.com/steveleetn91/cordova-firebase.git

Now you can check changes on Dashboard Firebase.


## How to use? 

Call:

    window.googlesignin.googlesignin().then(() => {

    }).catch(() => {

    });

Recieve:

    document.addEventListener("google.signin.DONE",(resp) => {
        console.log(resp.token);
    })

    document.addEventListener("google.signin.FAIL",() => {
        // do a something
    })
