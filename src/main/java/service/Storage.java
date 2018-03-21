package service;

import model.User;

import java.util.HashMap;
import java.util.Map;

public class Storage {

    private static volatile Storage instance;
    private static Map<Integer, User> users = new HashMap<Integer, User>();
    private static int lastUserId = 0;

    private Storage(){}

    public void addUser(User user){
        users.put(user.getUserId(), user);
        System.out.println(users.get(user.getUserId()));
    }

    public User getUser(int key) throws Exception {
        if (users.containsKey(key)) {
            return users.get(key);
        } else throw new Exception("This key does not exist");
    }

    public int getUsersSize(){
        return users.size();
    }

    public static int getLastUserId(){
        return lastUserId;
    }

    public static Map<Integer, User> getAllUsers(){
        return users;
    }

    public void deleteUser(int key) throws Exception {
        if (users.containsKey(key)) {
            users.remove(key);
        } else throw new Exception("This key does not exist");
    }

    public static Storage getInstance() {
        Storage localInstance = instance;
        if (localInstance == null) {
            synchronized (Storage.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new Storage();
                }
            }
        }
        return localInstance;
    }
}
