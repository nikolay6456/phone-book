package com.nikolay.phonebook;

import com.nikolay.phonebook.entity.PhoneBook;

public class App 
{
    public static void main( String[] args )
    {
    	PhoneBook phonebook = new PhoneBook(12, 8098860, "Nikolay", "Kozak");
    	System.out.println(phonebook);
    }
}

