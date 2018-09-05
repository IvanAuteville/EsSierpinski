package sierpinski;

public class Sierpinski
{
    static public boolean esSierpinski(int k)
    {
	double sierp = 0;

	// Inclui el 0 porque segun el convenio es natural o no...
	for (int n = 0; n < 1001; n++)
	{
	    // Utilizo la formula de Sierpinski.
	    sierp = k * Math.pow(2, n) + 1;

	    // Si el numero es primo ya puedo concluir que no es Sierpinski.
	    if (esPrimo(sierp))
	    {
		return false;
	    }

	    // El numero es compuesto, continuo probando con otros n...
	}

	// Si llegue hasta aca, es Sierpinski.
	return true;
    }

    static public boolean esPrimo(double sierp)
    {
	// El 1 por convenio no se considera ni primo ni compuesto.
	if (sierp == 1)
	{
	    return false;
	}

	int i = 2;

	while (i < sierp)
	{
	    if (sierp % i == 0)
	    {
		return false;
	    }

	    i++;
	}

	// Si llegue hasta aca, el numero es solo divisible por 1 y si mismo.
	return true;
    }
}
