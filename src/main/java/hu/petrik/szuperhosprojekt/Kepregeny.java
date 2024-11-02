package hu.petrik.szuperhosprojekt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Kepregeny {
    public static List<Szuperhos> szuperhosLista = new ArrayList<>();
    public static void szereplok(String path) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader( path ));
        while (reader.ready())
        {
            String line = reader.readLine();
            String[] pieces = line.split(" ");
            if (Objects.equals(pieces[0], "Batman"))
            {
                Batman batman = new Batman();
                for (int i = 0; i < Integer.parseInt(pieces[1]); i++)
                {
                    batman.kutyutKeszit();
                }
                szuperhosLista.add(batman);
            }
            else if (Objects.equals(pieces[0], "Vasember"))
            {
                Vasember vasember = new Vasember();
                for (int i = 0; i < Integer.parseInt(pieces[1]); i++)
                {
                    vasember.kutyutKeszit();
                }
                szuperhosLista.add(vasember);
            }
        }
    }
    public static void szuperhosok()
    {
        for (Szuperhos szuperhos : szuperhosLista) {
            System.out.println(szuperhos.toString());
        }
    }
}
