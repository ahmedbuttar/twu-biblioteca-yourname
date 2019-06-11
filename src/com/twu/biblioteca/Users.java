package com.twu.biblioteca;

import java.util.ArrayList;

public class Users {
    static ArrayList<User> users = new ArrayList<User>();
    User loggedInUser;

    static {
        User user = new User("Arthur","222-2222","arthur101","arthur@outlook.com","222-345-5555");
        User user1 = new User("Jim","333-3333","jim101","jim@outlook.com","333-345-5555");
        User user2 = new User("Tom","444-4444","tom101","tom@outlook.com","444-345-5555");
        users.add(user);
        users.add(user1);
        users.add(user2);
    }

    public boolean login(String libraryNumber,String password){
        for(int i=0;i<users.size();i++){
            if(users.get(i).getLibraryNumber().equals(libraryNumber)){
                if(password.equals(users.get(i).getPassword())){
                    loggedInUser = users.get(i);
                    System.out.println("You are logged in");
                    return true;
                }else{
                    System.out.println("Wrong password!, Please try again");
                    return false;
                }
            }
        }
        System.out.println("No user found");
        return false;
    }

    public void showCurrentUser(){
        System.out.println(loggedInUser.toString());
    }


}
