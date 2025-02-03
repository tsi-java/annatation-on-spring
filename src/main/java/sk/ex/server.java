package sk.ex;

public interface server {
    void warning(String warn);
    int getPatch();
    void Start();
    String getName();
    void setName(String name);
    String getVersion();
    void setVersion(String version);
    String getDateUpdate();
    void setDateUpdate(String dateUpdate);
    void Update(String Date);
    int getOnline();
    Plugins[] getPlugins();
    String getCore();
    Core[] getCores();
}
