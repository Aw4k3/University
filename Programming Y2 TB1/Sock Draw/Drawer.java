import java.util.ArrayList;

public class Drawer {
  private ArrayList<Sock> socks = new ArrayList<Sock>();

  public Sock getSock(int n) {
    return socks.get(n - 1);
  }

  public void addSock(Sock sock) {
    socks.add(sock);
  }

  public boolean hasPair() {
    /*
     * Why does this not work :(
     * 
     * ArrayList<Sock> _socks = new ArrayList<Sock>();
     * for (Sock sock : socks) if (!_socks.contains(sock)) _socks.add(sock);
     * if (socks.size() > _socks.size()) return true;
     * return false;
     */
    
    /*
     * Why does this also not work :((
     * 
     * for (int i = 0; i < socks.size(); i++)
     *   for (int j = 0; j < socks.size(); j++)
     *     if (socks.get(i).toString() == socks.get(j).toString()) return true;
     * 
     * return false;
     */

     // Finally works thanks to Hetty :D
    for (int i = 0; i < socks.size(); i++) {
      Sock x = socks.get(i);
      for (int j = i + 1; j < socks.size(); j++) {
        Sock y = socks.get(j);
        if (x.isPair(y)) return true;
      }
    }
    return false;
  }
}