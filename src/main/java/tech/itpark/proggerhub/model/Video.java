package tech.itpark.proggerhub.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Value;

// Data Class
@AllArgsConstructor
@Data // get/set + equals/hashCode/toString
public class Video {
    private String id;
    private String name;
    private String posterUrl;
    private String previewUrl;
    private int duration;
    private long created;
    private long views;
}
