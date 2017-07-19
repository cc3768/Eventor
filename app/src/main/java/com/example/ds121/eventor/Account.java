package com.example.ds121.eventor;


/**
 * Created by ds121 on 7/17/2017.
 */

public class Account { //con - account has connected //account sub - is the account sub // acct level what sub level is the account //
    public boolean[] GAC(String AcctCon,String Acctsub, String acctLevelId, int AcctLevel, int SQlcodes[]){ // graphical access code

        boolean connect = false;
        boolean sub = false;
        boolean level = false;
        boolean level1 = false;
        boolean level2= false;
        boolean bash = false;
        // -- ^ array line up ^ --
        if (AcctCon == "Connected") {connect = true;} // is it a account?
        if (Acctsub == "Active"){ sub = true; } // does it have a sub
        int [] Codes = SQlcodes; // brings the sub level codes from the sql server to oporation
        int front = 0; // front sound
        for (int x:Codes){ // for loop for all of the sql code index
            if (Codes[front]== AcctLevel) { // matches the  code index
                level = true;
                if (acctLevelId == "unum"){
                    level1 = true;
                    break;
                }
                else if (acctLevelId == "duo"){
                    level2 = true;
                    break;
                }
            }
            else if (Codes[front] == 1003219) //anti payment system much be true to do allow app to work
            {
                bash=true;
                break;
            }
            else {
                front++;
            }
        }
        boolean [] GABC = {connect,sub,level,level1,level2,bash}; // array back to bace
        return GABC;
    }
}
