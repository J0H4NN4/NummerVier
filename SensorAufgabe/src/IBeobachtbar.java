public interface IBeobachtbar {
    void anmelden(IBeobachter tempViewer);
    void abmelden(IBeobachter tempViewer);
    public int gibZustand();
}
