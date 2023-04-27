package coffee.images_beverage;

public enum MaintenanceImageFile {
    ICON("/img/maintenance.png");
    private final String imageFile;
    MaintenanceImageFile(String maintenanceType) {
        this.imageFile = maintenanceType;
    }
    @Override
    public String toString() {
        return imageFile;
    }
}
