/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.oop1.entity;

/**
 *
 * @author student
 */
public class Student {
    public int getGroupId() {
        return id;
    }
    public void setGroupId(int id) throws Exception {
        
        if (id >= 0) {
            
            this.id = id;
        } else {
            
            throw new Exception("id должен быть больше или равен 0");
        }
    }
    public int getId() {
        return id;
    }
    public void setId(int id) throws Exception {
        
        if (id >= 0) {
            
            this.id = id;
        } else {
            
            throw new Exception("id должен быть больше или равен 0");
        }
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String name) {
        this.lastName = name;
    }
    
//Позвонить Саше
    public int id;
    public String firstName;
    public String lastName;
    public int groupId;
}
