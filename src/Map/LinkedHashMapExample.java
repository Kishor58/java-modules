package Map;

import java.util.*;
import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        YouTubeWatchHistory watchHistory = new YouTubeWatchHistory(5); // Limit history to 5 videos

        // Watching some videos
        watchHistory.watchVideo("Java Collections Explained", "CodeWithMe");
        watchHistory.watchVideo("SpaceX Starship Launch", "NASA Space News");
        watchHistory.watchVideo("Best Coding Music", "ChillHub");
        watchHistory.watchVideo("Cricket Highlights", "Star Sports");
        watchHistory.watchVideo("Top 10 Anime", "AnimeWorld");

        watchHistory.printWatchHistory();

        // Watching an old video again - moves it to the end
        watchHistory.watchVideo("Java Collections Explained", "CodeWithMe");

        // Watching a new video - oldest video should be removed
        watchHistory.watchVideo("How to Cook Pasta", "Tasty");

        watchHistory.printWatchHistory();
    }
}


class YouTubeWatchHistory extends LinkedHashMap<String, String> {
    private final int maxHistorySize;

    public YouTubeWatchHistory(int size) {
        super(size, 0.75f, true); // true = access order
        this.maxHistorySize = size;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<String, String> eldest) {
        return size() > maxHistorySize;
    }

    // Simulate watching a video
    public void watchVideo(String title, String channel) {
        put(title, channel); // If video exists, moves it to most recent
    }

    // Print current watch history
    public void printWatchHistory() {
        System.out.println("\n YouTube Watch History (Most Recent Last):");
        for (Map.Entry<String, String> entry : entrySet()) {
            System.out.println("- " + entry.getKey() + " by " + entry.getValue());
        }
    }
}
