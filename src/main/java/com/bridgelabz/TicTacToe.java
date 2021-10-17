package com.bridgelabz;

import java.util.*;

public class TicTacToe {

	static Scanner scanner = new Scanner(System.in);
    static char [] board = new char[10];
    static char playerChoice;
    static char computerChoice;

    /* Initializing an array of size 10
       In array we have to create an empty space for array[index] from 1 to 9.
     */
    public static void createBoard(){
        for (int index=1; index<board.length; index++){
            board[index] = ' ';
        }
    }

    /* In this player have to choose the character value between 'X' or 'O'.
       We have to allow the player to choose between X or O.
     */
    static void choose(){
        System.out.print("Enter your Choice : ");
        char choice = scanner.next().charAt(0);
        if (choice == 'X' || choice == 'x'){
            playerChoice = 'X';
            computerChoice = 'O';
            System.out.println("Player Choice : " + playerChoice);
            System.out.println("Computer Choice : " + computerChoice);
        }else if (choice == 'O' || choice == 'o'){
            playerChoice = 'O';
            computerChoice = 'X';
            System.out.println("Player Choice : " + playerChoice);
            System.out.println("Computer Choice : " + computerChoice);
        }
        else {
            System.out.println("Invalid Choice! Enter a valid choice between X or O");
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe Game");
        createBoard();
        choose();
    }
}
