/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enum;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Vanina
 */
public enum TipoDeCartas {
    ORO,
    ESPADA,
    COPA,
    BASTO;

    private static final List<TipoDeCartas> PALOS =
            Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = PALOS.size();
    private static final Random RANDOM = new Random();
    public static TipoDeCartas randomCartas()  {
        return PALOS.get(RANDOM.nextInt(SIZE));
    }
}
