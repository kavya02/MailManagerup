package myhomework.com.meilmanager.model;







public class UserInfomation {
    public boolean isOnline;
    String _userID;
    String _userName;
    String _userImage;
    String _PublicKey;
    public UserInfomation(){

    }
    // constructor
    public UserInfomation(String userID, String strUserName, String strImage, String strPublicKey) {
        this._userID = userID;
        this._userName = strUserName;
        this._userImage = strImage;
        this._PublicKey = strPublicKey;
    }
    public String getUserID() {
        return  this._userID;
    }
    public void setUserID(String userID) {
        this._userID = userID;
    }
    public String getUserName(){
        return this._userName;
    }
    public void setUserName(String studentEmail){
        this._userName = studentEmail;
    }
    public String getPublicKey(){
        return this._PublicKey;
    }
    public void setPublicKey(String emailSubject){
        this._PublicKey = emailSubject;
    }
    public String getUserImage(){
        return this._userImage;
    }
    public void setUserImage(String emailContent){
        this._userImage = emailContent;
    }

}

