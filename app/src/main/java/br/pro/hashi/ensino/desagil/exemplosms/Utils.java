package br.pro.hashi.ensino.desagil.exemplosms;

import android.content.Context;
import android.widget.Toast;

public class Utils {
    public static void showToast(Context context, String message) {
        // Exemplo de código para mostrar uma bolha de mensagem. Especificamente, uma rápida.
        Toast toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
        toast.show();
    }
}
