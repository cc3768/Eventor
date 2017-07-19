package com.example.ds121.eventor;


/**
 * Created by ds121 on 7/17/2017.
 */

public class Account { //con - account has connected //account sub - is the account sub // acct level what sub level is the account //

    public static boolean[] codeexchange(int levelid,int Codesin[],String levelname) {
        boolean idlevel = false;
        boolean idlevel1 = false;
        boolean idlevel2 = false;
        boolean idbash = false;
        int front = 0; // front sound
        for (int x : Codesin) { // for loop for all of the sql code index
            if (Codesin[front] == levelid) { // matches the  code index
                idlevel = true;
                if (levelname == "unum") {
                    idlevel1 = true;
                    break;
                } else if (levelname == "duo") {
                    idlevel2 = true;
                    break;
                }
            } else if (Codesin[front] == 1003219) //anti payment system much be true to do allow app to work
            {
                idbash = true;
                break;
            } else {
                front++;
            }
        }
        boolean[] Forces = {idlevel, idlevel1, idlevel2, idbash};
        return Forces;
    }


    public static boolean[] GAC(String AcctCon,String Acctsub, String acctLevelId, int AcctLevel, int SQlcodes[]){ // graphical access code

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
        boolean[] codeanw = codeexchange(AcctLevel, SQlcodes,acctLevelId);
        boolean [] GABC = {connect,sub, codeanw[0], codeanw[1],codeanw[2],codeanw[3]}; // array back to bace
        return GABC;
    }


}
