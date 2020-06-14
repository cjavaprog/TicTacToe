/*
Created by Konrad Czechowicz
@version v1.0
 */
package com.company;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
	// write your code here
        // appearance of game board
        Scanner scn = new Scanner(System.in);
        int position = 0;
        int cpuPos = 0;

        char[][] board = {{' ', '|', ' ', '|',' '},
                          {'-', '+', '-', '+','-'},
                          {' ', '|', ' ', '|',' '},
                          {'-', '+', '-', '+','-'},
                          {' ', '|', ' ', '|',' '}};

        System.out.println("WELCOME TO TIC TAC TOE GAME");
        printBoard(board);

        while (!win(board)) {
            System.out.println("Choose position: ");
            position = scn.nextInt();
            System.out.println(position);
            printChar(board, position, "player");
            Random rand = new Random();
            System.out.println(position);
            cpuPos = rand.nextInt(9) + 1;
            printChar(board, cpuPos, "cpu");
        }
    }

    // Prints game board
    public static void printBoard(char[][] board){
        for(char[] row : board){
            for(char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
        System.out.println();
    }

    // Win checker
    public static boolean win(char[][] board){
        if((board[0][0] != ' ' && (board[0][0] == board[0][2] && board[0][0] == board [0][4] ||
                                   board[0][0] == board[2][2] && board[0][0] == board [4][4] ||
                                   board[0][0] == board[2][0] && board[0][0] == board [4][0]) && board[0][0] == 'X') ||
            (board[0][2] != ' ' && (board[0][2] == board[2][2] && board[0][2] == board[4][2]) && board[0][2] == 'X') ||
            (board[0][4] != ' ' && (board[0][4] == board[2][4] && board[0][4] == board[4][4]) && board[0][4] == 'X') ||
            (board[2][0] != ' ' && (board[2][0] == board[2][2] && board[2][0] == board[2][4]) && board[2][0] == 'X') ||
            (board[4][0] != ' ' && (board[4][0] == board[4][2] && board[4][0] == board[4][4] ||
                                    board [4][0] == board[2][2] && board[4][0] == board[0][4]) && board[4][0] == 'X')) {
            System.out.println("Player wins");
            return true;
        }
        else if((board[0][0] != ' ' && (board[0][0] == board[0][2] && board[0][0] == board [0][4] ||
                                        board[0][0] == board[2][2] && board[0][0] == board [4][4] ||
                                        board[0][0] == board[2][0] && board[0][0] == board [4][0]) && board[0][0] == 'O') ||
                (board[0][2] != ' ' && (board[0][2] == board[2][2] && board[0][2] == board[4][2]) && board[0][2] == 'O') ||
                (board[0][4] != ' ' && (board[0][4] == board[2][4] && board[0][4] == board[4][4]) && board[0][4] == 'O') ||
                (board[2][0] != ' ' && (board[2][0] == board[2][2] && board[2][0] == board[2][4]) && board[2][0] == 'O') ||
                (board[4][0] != ' ' && (board[4][0] == board[4][2] && board[4][0] == board[4][4] ||
                                        board [4][0] == board[2][2] && board[4][0] == board[0][4]) && board[4][0] == 'O')) {
            System.out.println("CPU wins");
            return true;
        }
        else
            return false;
    }

    // Adds X or O to game board
    public static void printChar(char[][] board, int pos, String player){
        char symbol;
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int cpuP = 0;
        int p = 0;
        if (player == "player") {
            symbol = 'X';
        }
        else if(player == "cpu") {
            symbol = 'O';
        }
        else
            symbol = 'n';
        switch (pos) {
            case 1:
                if (board[0][0] == ' ')
                    board[0][0] = symbol;
                else if (player == "cpu") {
                    cpuP = r.nextInt(9) + 1;
                    if(cpuP != 1)
                        printChar(board, cpuP, "cpu");
                }
                else if (player == "player"){
                    p = 1;
                    while(p == 1) {
                        System.out.print("Choose another number");
                        p = sc.nextInt();
                        printChar(board, p, "player");
                    }
                }
                break;
            case 2:
                if (board[0][2] == ' ')
                    board[0][2] = symbol;
                else if (player == "cpu") {
                    cpuP = r.nextInt(9) + 1;
                    if(cpuP != 2)
                        printChar(board, cpuP, "cpu");
                }
                else if (player == "player"){
                    p = 2;
                    while(p == 2) {
                        System.out.print("Choose another number");
                        p = sc.nextInt();
                        printChar(board, p, "player");
                    }
                }
                break;
            case 3:
                if (board[0][4] == ' ')
                    board[0][4] = symbol;
                else if (player == "cpu") {
                    cpuP = r.nextInt(9) + 1;
                    if(cpuP != 3)
                        printChar(board, cpuP, "cpu");
                }
                else if (player == "player"){
                    p = 3;
                    while(p == 3) {
                        System.out.print("Choose another number");
                        p = sc.nextInt();
                        printChar(board, p, "player");
                    }
                }
                break;
            case 4:
                if (board[2][0] == ' ')
                    board[2][0] = symbol;
                else if (player == "cpu"){
                    cpuP = r.nextInt(9) + 1;
                    if(cpuP != 4)
                        printChar(board, cpuP, "cpu");
                }
                else if (player == "player"){
                    p = 4;
                    while(p == 4) {
                        System.out.print("Choose another number");
                        p = sc.nextInt();
                        printChar(board, p, "player");
                    }
                }
                break;
            case 5:
                if(board[2][2] == ' ')
                    board[2][2] = symbol;
                else if (player == "cpu") {
                    cpuP = r.nextInt(9) + 1;
                    if(cpuP != 5)
                        printChar(board, cpuP, "cpu");
                }
                else if (player == "player"){
                    p = 5;
                    while(p == 5) {
                        System.out.print("Choose another number");
                        p = sc.nextInt();
                        printChar(board, p, "player");
                    }
                }
                break;
            case 6:
                if(board[2][4] == ' ')
                    board[2][4] = symbol;
                else if (player == "cpu") {
                    cpuP = r.nextInt(9) + 1;
                    if(cpuP != 6)
                        printChar(board, cpuP, "cpu");
                }
                else if (player == "player"){
                    p = 6;
                    while(p == 6) {
                        System.out.print("Choose another number");
                        p = sc.nextInt();
                        printChar(board, p, "player");
                    }
                }
                break;
            case 7:
                if(board[4][0] == ' ')
                    board[4][0] = symbol;
                else if (player == "cpu") {
                    cpuP = r.nextInt(9) + 1;
                    if(cpuP != 7)
                        printChar(board, cpuP, "cpu");
                }
                else if (player == "player"){
                    p = 7;
                    while(p == 7) {
                        System.out.print("Choose another number");
                        p = sc.nextInt();
                        printChar(board, p, "player");
                    }
                }
                break;
            case 8:
                if(board[4][2] == ' ')
                    board[4][2] = symbol;
                else if (player == "cpu") {
                    cpuP = r.nextInt(9) + 1;
                    if(cpuP != 8)
                        printChar(board, cpuP, "cpu");
                }
                else if (player == "player"){
                    p = 8;
                    while(p == 8) {
                        System.out.print("Choose another number");
                        p = sc.nextInt();
                        printChar(board, p, "player");
                    }
                }
                break;
            case 9:
                if(board[4][4] == ' ')
                    board[4][4] = symbol;
                else if (player == "cpu") {
                    cpuP = r.nextInt(9) + 1;
                    if(cpuP != 9)
                        printChar(board, cpuP, "cpu");
                }
                else if (player == "player"){
                    p = 9;
                    while(p == 9) {
                        System.out.print("Choose another number");
                        p = sc.nextInt();
                        printChar(board, p, "player");
                    }
                }
                break;
            default:
                break;
        }
        printBoard(board);
    }
}
