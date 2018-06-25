package com.mario.app;

import com.mario.model.MarioEdges;
import com.mario.navigation.MarioNavigation;
import com.mario.util.MarioUtil;

import java.io.IOException;

public class MarioInvadeApp {

    public static void main(String[] args) throws IOException {

        MarioEdges marioEdges = MarioUtil.setMarioEdgesWithProperties("/Users/ravikanthtadikonda/git/supermario/input.properties");
        System.out.println(MarioNavigation.navigationPath(marioEdges));

 }
}
