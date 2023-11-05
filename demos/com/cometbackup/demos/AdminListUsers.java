package com.cometbackup.demos;

import com.cometbackup.CometAPI;


/**
 * Simple API usage demo - connect to local server and list all users
 */
public class AdminListUsers {
    public static void main(String[] args) {
        var client = new CometAPI("http://127.0.0.1:8060", "admin", "admin");
        try {
            for (var user : client.AdminListUsers()) {
                System.out.println(user);
            }
        } catch(Exception e){
            e.printStackTrace(System.out);
        }
    }
}