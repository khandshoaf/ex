package storage.model.database;

import com.google.gson.annotations.SerializedName;

public class Logger {
    @SerializedName("isLog")
    private boolean isLog;

    @SerializedName("isFile")
    private boolean isFile;

    @SerializedName("level")
    private String level;

    @SerializedName("directory")
    private String directory;

    // Constructors, Getters, and Setters
}
