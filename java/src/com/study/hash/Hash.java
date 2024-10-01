package com.study.hash;

public class Hash {
    public Slot[] hashTable;

    public Hash(Integer size) {
        this.hashTable = new Slot[size];
    }

    public class Slot {
        String value;
        Slot(String value) {
            this.value = value;
        }
    }

    public int hashFunc(String key) {
        return (int) (key.charAt(0)) % this.hashTable.length;
    }

    public boolean saveData(String key, String value) {
        Integer address = this.hashFunc(key);
        if (this.hashTable[address] != null) {
            this.hashTable[address].value = value;
        } else {
            this.hashTable[address] = new Slot(value);
        }
        return true;
    }

    public String getData(String key) {
        Integer address = this.hashFunc(key);
        if (this.hashTable[address] != null) {
            return this.hashTable[address].value;
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        Hash mainObject = new Hash(20);
        mainObject.saveData("foo", "01022223333");
        mainObject.saveData("zee", "01033334444");
        mainObject.saveData("den", "01044445555");
        mainObject.saveData("fez", "01055556666");
        System.out.println(mainObject.getData("foo"));
        System.out.println(mainObject.getData("zee"));
        System.out.println(mainObject.getData("den"));
        System.out.println(mainObject.getData("fez"));
    }
}
