package com.study.hash;

public class Hash01 {

    public Slot[] hashTable;

    public Hash01(Integer size) {
        this.hashTable = new Slot[size];
    }

    public class Slot {
        String key;
        String value;
        String next;
        Slot(String key, String value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    public int hashFunc(String key) {
        return (int) (key.charAt(0)) % this.hashTable.length;
    }

    public boolean saveData(String key, String value) {

        // 0. 해시 테이블 저장
//        Integer address = this.hashFunc(key);
//        if (this.hashTable[address] != null) {
//            this.hashTable[address].value = value;
//        } else {
//            this.hashTable[address] = new Slot(key, value);
//        }
//        return true;

        // 1. Chaining 기법을 사용하여 해시 테이블 저장
        Integer address = this.hashFunc(key);
        if (this.hashTable[address] != null) {
            Slot findSlot = this.hashTable[address];
            Slot prevSlot = this.hashTable[address];
            while (findSlot != null) {
                if (findSlot.key == key) {
                    findSlot.value = value;
                    return true;
                } else {
                    prevSlot = findSlot;
                    findSlot = findSlot.next;
                }
            }
        } else {
            this.hashTable[address] = new Slot(key, value);
        }
        return true;

        // 2. Linear Probing 기법을 사용하여 해시 테이블 저장
//        Integer address = this.hashFunc(key);
//        if (this.hashTable[address] != null) {
//            if (this.hashTable[address].key == key) {
//                this.hashTable[address].value = value;
//                return true;
//            } else {
//                Integer currAddress = address + 1;
//                while (this.hashTable[currAddress] != null) {
//                    if (this.hashTable[currAddress].key == key) {
//                        this.hashTable[currAddress].value = value;
//                        return true;
//                    } else {
//                        currAddress++;
//                        if (currAddress >= this.hashTable.length) {
//                            return false;
//                        }
//                    }
//                }
//                this.hashTable[currAddress] = new Slot(key, value);
//                return true;
//            }
//        } else {
//            this.hashTable[address] = new Slot(key, value);
//            return true;
//        }
    }

    public String getData(String key) {
        // 1. Chaining 기법을 사용하여 해시 테이블 조회
        Integer address = this.hashFunc(key);
        if (this.hashTable[address] != null) {
            Slot findSlot = this.hashTable[address];
            while (findSlot != null) {
                if (findSlot.key == key) {
                    return findSlot.value;
                } else {
                    findSlot = findSlot.next;
                }
            }
            return null;
            // return this.hashTable[address].value;
        } else {
            return null;
        }

        // 2. Linear Probing 기법을 사용하여 해시 테이블 조회

    }
}
