package app;

import java.util.ArrayList;


public class Outputer {

    public void getOutput(ArrayList<Contact> list, int index) {
        String output = list.get(index).toString();
        System.out.println(output);
    }

    public void getOutputList(ArrayList<Contact> list) {
        int count = 0;
        for (Contact contact : list) {
            count++;
            System.out.println(count + ") " + contact);

        }
    }
}
