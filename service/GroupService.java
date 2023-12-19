package service;

import java.util.*;

import model.*;


public class GroupService  {



    public Group createGroup (int number, User teacher, List<User> students) {


        return new Group(number,teacher,students);


    }


}