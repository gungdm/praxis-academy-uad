/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package kasus;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testTambah() {
        App coba = new App();
        int hasil = coba.tambah(-70, 80);

        assertEquals(10, hasil);
    }
    
}