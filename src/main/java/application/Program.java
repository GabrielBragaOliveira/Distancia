/*
 * Copyright (C) 2024 Gabriel Braga Oliveira <ninjagamer9795286@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package application;

import entities.Pontos;
import java.util.Scanner;

/**
 *
 * @author Gabriel Braga Oliveira <ninjagamer9795286@gmail.com>
 * @date 26/04/2024
 * @brief Class Program
 */
public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva o x do ponto A: ");
        double x1 = sc.nextDouble();
        System.out.print("Escreva o y do ponto A: ");
        double y1 = sc.nextDouble();
        System.out.print("Escreva o x do ponto B: ");
        double x2 = sc.nextDouble();
        System.out.print("Escreva o y do ponto B: ");
        double y2 = sc.nextDouble();
        System.out.print("Escreva o x do ponto C: ");
        double x3 = sc.nextDouble();
        System.out.print("Escreva o y do ponto C: ");
        double y3 = sc.nextDouble();

        Pontos ponto = new Pontos(x1, x2, x3, y1, y2, y3);
        ponto.colineares();
        

    }
}
