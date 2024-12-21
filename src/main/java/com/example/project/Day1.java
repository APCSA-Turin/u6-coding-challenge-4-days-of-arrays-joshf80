package com.example.project;
public class Day1{
    private static String[] elf_names = {"Glitter", "Chocolate","Tiny","Snowflake","Frosty"};

    public static String generateElfName(String name)   {
        if(name.equals("") || name.equals(null)) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        int random = (int)(Math.random() * 5);
        return elf_names[random] + " " + name;
    }
}