/* 
 * Copyright (C) 2020 mon_mode   0mon.mode@gmail.com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package org.monmo.java.main;

/**
 *
 * @author nv3ob61
 */
public class Main {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //value to calc levels
    new FibExt().setVisible(true);
  }

  @Deprecated
  public static final void showFib(double[] lvl) {

    //otro separador de nada..  esto no se utiliza. Ver métodos del frame.
    System.out.println();

    System.out.println("FIB RETRACEMENT / EXTENSIONS");
    System.out.println("***************");
    System.out.println("-0.786: " + lvl[10]);
    System.out.println("-0.618: " + lvl[11]);
    System.out.println("-0.5  : " + lvl[12]);
    System.out.println("-0.382: " + lvl[13]);
    System.out.println("-0.236: " + lvl[14]);
    System.out.println("***************");
    System.out.println(" 0    : " + lvl[15]);
    System.out.println(" 0.236: " + lvl[16]);
    System.out.println(" 0.382: " + lvl[17]);
    System.out.println(" 0.5  : " + lvl[18]);
    System.out.println(" 0.618: " + lvl[19]);
    System.out.println(" 0.786: " + lvl[20]);
    System.out.println(" 1    : " + lvl[21]);
    System.out.println("***************");
    System.out.println(" 1.618: " + lvl[22]);
    System.out.println(" 2.618: " + lvl[23]);
    System.out.println(" 3.618: " + lvl[24]);
    System.out.println(" 4.236: " + lvl[25]);
    System.out.println("*********************");
  }
}
