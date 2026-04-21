package demo.data;

import java.time.Duration;
import java.time.Instant;

public class SupportoLPONumeri26 {
    /**
	 * Il metodo, dato un numero intero a, verifica se è primo o no.
	 * @param a il numero da verificare
	 * @return true se è primo, false altrimenti
	 */
		
    public static boolean isPrime(int a) {
        if (a <= 1) {
            return false;
        }
        if (a <= 3) {
            return true;
        }
        if (a % 2 == 0 || a % 3 == 0) {
            return false;
        }
        for (int number = 2; number < Math.sqrt(a); number++)
            if (a % number == 0) {
                return false;
            }
        return true;
    }
	/**
	 * Il metodo, dato un numero intero a, verifica se è pari e se è la somma di due numeri primi.
	 * Per esempio, abbiamo 4 = 2 + 2, 6 = 3 + 3, 8 = 5 + 3, .
	 * @param a	il numero da verificare
	 * @return	true se è pari e la somma di due numeri primi, false altrimenti
	 */
    public static boolean goldbach(int a) {
        if (a <= 2 || a % 2 != 0) {
            return false;
        }
        for (int i = 2; i < a; i++) {
            if (isPrime(i) && isPrime(a - i)) {
                return true;
            }
        }
        return false;
    }

    /**
	 * Il metodo, dato un numero intero n, verifica che la congettura di Goldbach è
	 * vera per tutti i numeri minori di n. Usare isPrime. Una congettura matematica
	 * ancora aperta è quella di Goldbach: ogni numero pari piú grande di 4 è la
	 * somma di due numeri primi. Per esempio, abbiamo 4 = 2 + 2, 6 = 3 + 3, 8 = 5 +
	 * 3, .
	 * 
	 * @param n il numero fino al quale verificare la congettura
	 * @return true se la congettura è vera fino a quel numero
	 */
	public static boolean goldbachUntil(int n) {
    Instant inizio = Instant.now();

		if (n %2 != 0) {
			System.out.println(n + " non è un numero pari");
			return false;
		}
		int j;
		boolean ok;
		System.out.println(n);

		// ITERARE SOLO SUI NUMERI PARI
		for (int i = 4; i <= n; i += 2) {
			ok = false;
			j = 2;
			// RAGIONIAMO...
			while (!ok && j <= (i / 2)) {
				if (isPrime(j) && isPrime(i - j))
					ok = true;
				j++;
			}
			if (!ok) {
				Duration timeElapsed = Duration.between(inizio, Instant.now());
				System.out.printf("Tempo trascorso: %d millisecondi\n", timeElapsed.toMillis());
				return false;
			}
		}
		Duration timeElapsed = Duration.between(inizio, Instant.now());
        System.out.printf("Tempo trascorso: %d millisecondi\n", timeElapsed.toMillis());
		return true;
	}
}
