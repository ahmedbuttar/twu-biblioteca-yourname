package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UsersTest {
    Users users;
    @Before
    public void setUp() throws Exception {
        users = new Users();
    }

    @Test
    public void login() {
        assertEquals("test for login",true,users.login("222-2222","arthur101"));
        assertEquals("test for logi with wrong username",false,users.login("212-2122","arthur101"));
        assertEquals("test for login with wrong password",false,users.login("222-2222","arthur"));

    }

    @Test
    public void showCurrentUser() {
         users.login("222-2222","arthur101");
         assertEquals("test for show current user","Arthur",users.loggedInUser.getName());
    }
}