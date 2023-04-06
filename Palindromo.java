// Diogo Lourenzon Hatz - 32247389

public class Palindromo {
  Palindromo() {
    texto = "";
  }

  Palindromo(String texto) {
    this.texto = texto;
  }

  public String getTexto() {
    return texto;
  }

  public void setTexto(String texto) {
    if (texto != null) {
      this.texto = texto;
    }
  }

  public boolean verificar(String texto) {
    int i = 0;
    int j = texto.length() - 1;
    texto = texto.toLowerCase();
    StringBuilder str = new StringBuilder(texto);
    while (i <= j) {
      if (str.charAt(i) != str.charAt(j)) {
        switch (str.charAt(i)) {
          case '!':
          case '?':
          case ' ':
          case ',':
          case '.':
            i++;
            break;
          case 'á':
          case 'ã':
          case 'â':
          case 'à':
            str.setCharAt(i, 'a');
            break;
          case 'é':
          case 'ê':
            str.setCharAt(i, 'e');
            break;
          case 'í':
            str.setCharAt(i, 'i');
            break;
          case 'ó':
          case 'õ':
          case 'ô':
            str.setCharAt(i, 'o');
            break;
          case 'ú':
            str.setCharAt(i, 'u');
            break;
          default:
            switch (str.charAt(j)) {
              case '!':
              case '?':
              case ' ':
              case ',':
              case '.':
                j--;
                break;
              case 'á':
              case 'ã':
              case 'â':
              case 'à':
                str.setCharAt(j, 'a');
                break;
              case 'é':
              case 'ê':
                str.setCharAt(j, 'e');
                break;
              case 'í':
                str.setCharAt(j, 'i');
                break;
              case 'ó':
              case 'õ':
              case 'ô':
                str.setCharAt(j, 'o');
                break;
              case 'ú':
                str.setCharAt(j, 'u');
                break;
              default:
                return false;
         }
        }
      }

      else {
        i++;
        j--;
      }

    }
    return true;
  }

  private String texto;
}