package misskey4j.entity;

import java.net.URL;
import java.net.URLDecoder;
import java.util.Objects;

/**
 * ファイルオブジェクト
 */
public class File {

    private String id;
    private String createdAt;
    private String name;
    private String type;
    private Long size;
    private String url;
    private String thumbnailUrl;
    private String folderId;
    private Boolean isSensitive;

    private String extractForwardUrl(String u) {
        try {
            URL structure = new URL(u);
            if (structure.getPath().endsWith("image.webp")) {
                String[] queries = structure.getQuery().split("&");

                for (String query : queries) {
                    String[] elements = query.split("=");

                    if (elements.length == 2 && elements[0].equals("url")) {
                        return URLDecoder.decode(elements[1], "UTF-8");
                    }
                }
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }

    public String getUrl() {
        String forwardUrl = extractForwardUrl(url);
        return (forwardUrl != null) ? forwardUrl : url;
    }

    public String getThumbnailUrl() {
        String forwardUrl = extractForwardUrl(thumbnailUrl);
        return (forwardUrl != null) ? forwardUrl : thumbnailUrl;
    }

    public String getOriginalUrl() {
        return url;
    }

    public String getOriginalThumbnailUrl() {
        return thumbnailUrl;
    }

    // region
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getFolderId() {
        return folderId;
    }

    public void setFolderId(String folderId) {
        this.folderId = folderId;
    }

    public Boolean getSensitive() {
        return isSensitive != null ? isSensitive : false;
    }

    public void setSensitive(Boolean sensitive) {
        isSensitive = sensitive;
    }
    // endregion
}