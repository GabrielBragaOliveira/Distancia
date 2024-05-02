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
package entities;

import java.util.*;

/**
 *
 * @author Gabriel Braga Oliveira <ninjagamer9795286@gmail.com>
 * @date 26/04/2024
 * @brief Class alinhados
 */
public class Pontos {

    private Double x1;
    private Double x2;
    private Double x3;
    private Double y1;
    private Double y2;
    private Double y3;

    public Pontos() {
    }

    public Pontos(Double x1, Double x2, Double x3, Double y1, Double y2, Double y3) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
    }

    public Double getX1() {
        return x1;
    }

    public void setX1(Double x1) {
        this.x1 = x1;
    }

    public Double getX2() {
        return x2;
    }

    public void setX2(Double x2) {
        this.x2 = x2;
    }

    public Double getX3() {
        return x3;
    }

    public void setX3(Double x3) {
        this.x3 = x3;
    }

    public Double distancia() {
        Double distancia = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        return distancia;
    }

    public void colineares() {
        Double det = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);

        if (det == 0) {
            System.out.print("Distancia: " + distancia());
        } else {
            System.out.println("Os pontos não estão alinhados");
        }
    }

}
