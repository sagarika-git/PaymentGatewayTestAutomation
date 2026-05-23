import com.microsoft.playwright.Playwright;

public class InstallBrowsers {
    public static void main(String[] args) {
        // Just creating the instance triggers Playwright to auto-download browsers
        System.out.println("Downloading Playwright browsers...");
        try (Playwright playwright = Playwright.create()) {
            System.out.println("Browsers successfully installed!");
        }
    }
}
