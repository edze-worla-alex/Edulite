# Edulite

Educative video upload platform

If you want to use your own account, in order to allow login to your app, allow authentication via email and password in tab Authentication/Sign-in method in your project settings (https://console.firebase.google.com/project/YOUR_PROJECT/authentication/providers)
Also, check Database rules in project settings (https://console.firebase.google.com/project/YOUR_PROJECT/database/YOUR_PROJECT/rules). 
My project uses below configs
{
"rules": {
".read": "auth != null",
".write": "auth != null"
}
}
