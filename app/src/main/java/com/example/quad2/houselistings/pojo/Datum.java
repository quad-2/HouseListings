
package com.example.quad2.houselistings.pojo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum {

    @SerializedName("parking")
    @Expose
    private String parking;
    @SerializedName("secondaryTitle")
    @Expose
    private String secondaryTitle;
    @SerializedName("dateOnly")
    @Expose
    private long dateOnly;
    @SerializedName("buildingName")
    @Expose
    private String buildingName;
    @SerializedName("deposit")
    @Expose
    private long deposit;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("street")
    @Expose
    private String street;
    @SerializedName("score")
    @Expose
    private Score score;
    @SerializedName("parkingDesc")
    @Expose
    private String parkingDesc;
    @SerializedName("forLease")
    @Expose
    private boolean forLease;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("bathroom")
    @Expose
    private long bathroom;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("pinCode")
    @Expose
    private long pinCode;
    @SerializedName("photoAvailable")
    @Expose
    private boolean photoAvailable;
    @SerializedName("totalFloor")
    @Expose
    private long totalFloor;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("accomodationTypeDesc")
    @Expose
    private String accomodationTypeDesc;
    @SerializedName("propertySize")
    @Expose
    private long propertySize;
    @SerializedName("longitude")
    @Expose
    private double longitude;
    @SerializedName("shortUrl")
    @Expose
    private String shortUrl;
    @SerializedName("gym")
    @Expose
    private boolean gym;
    @SerializedName("sharedAccomodation")
    @Expose
    private boolean sharedAccomodation;
    @SerializedName("shortlistedByLoggedInUser")
    @Expose
    private boolean shortlistedByLoggedInUser;
    @SerializedName("propertyTitle")
    @Expose
    private String propertyTitle;
    @SerializedName("ownerName")
    @Expose
    private String ownerName;
    @SerializedName("furnishing")
    @Expose
    private String furnishing;
    @SerializedName("balconies")
    @Expose
    private long balconies;
    @SerializedName("propertyAge")
    @Expose
    private long propertyAge;
    @SerializedName("cupBoard")
    @Expose
    private long cupBoard;
    @SerializedName("powerBackup")
    @Expose
    private String powerBackup;
    @SerializedName("accurateLocation")
    @Expose
    private boolean accurateLocation;
    @SerializedName("adminEvent")
    @Expose
    private String adminEvent;
    @SerializedName("managed")
    @Expose
    private Object managed;
    @SerializedName("floor")
    @Expose
    private long floor;
    @SerializedName("amenitiesMap")
    @Expose
    private AmenitiesMap amenitiesMap;
    @SerializedName("inactiveReasonDesc")
    @Expose
    private Object inactiveReasonDesc;
    @SerializedName("swimmingPool")
    @Expose
    private boolean swimmingPool;
    @SerializedName("lift")
    @Expose
    private boolean lift;
    @SerializedName("availableFrom")
    @Expose
    private long availableFrom;
    @SerializedName("active")
    @Expose
    private boolean active;
    @SerializedName("buildingType")
    @Expose
    private String buildingType;
    @SerializedName("localityId")
    @Expose
    private String localityId;
    @SerializedName("latitude")
    @Expose
    private double latitude;
    @SerializedName("weight")
    @Expose
    private double weight;
    @SerializedName("ownerId")
    @Expose
    private String ownerId;
    @SerializedName("loanAvailable")
    @Expose
    private boolean loanAvailable;
    @SerializedName("negotiable")
    @Expose
    private boolean negotiable;
    @SerializedName("activationDate")
    @Expose
    private long activationDate;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("facingDesc")
    @Expose
    private String facingDesc;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("propertyCode")
    @Expose
    private Object propertyCode;
    @SerializedName("rent")
    @Expose
    private long rent;
    @SerializedName("buildingId")
    @Expose
    private String buildingId;
    @SerializedName("detailUrl")
    @Expose
    private String detailUrl;
    @SerializedName("builderName")
    @Expose
    private String builderName;
    @SerializedName("furnishingDesc")
    @Expose
    private String furnishingDesc;
    @SerializedName("amenities")
    @Expose
    private String amenities;
    @SerializedName("society")
    @Expose
    private String society;
    @SerializedName("accomodationType")
    @Expose
    private Object accomodationType;
    @SerializedName("tenantTypeDesc")
    @Expose
    private String tenantTypeDesc;
    @SerializedName("typeDesc")
    @Expose
    private String typeDesc;
    @SerializedName("leaseType")
    @Expose
    private String leaseType;
    @SerializedName("lastUpdateDate")
    @Expose
    private long lastUpdateDate;
    @SerializedName("photos")
    @Expose
    private List<Photo> photos = null;
    @SerializedName("creationDate")
    @Expose
    private long creationDate;
    @SerializedName("waterSupply")
    @Expose
    private String waterSupply;
    @SerializedName("propertyType")
    @Expose
    private String propertyType;
    @SerializedName("inactiveReason")
    @Expose
    private Object inactiveReason;
    @SerializedName("locality")
    @Expose
    private String locality;
    @SerializedName("facing")
    @Expose
    private Object facing;
    @SerializedName("nbLocality")
    @Expose
    private String nbLocality;
    @SerializedName("sponsored")
    @Expose
    private boolean sponsored;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Datum() {
    }

    /**
     * 
     * @param parking
     * @param secondaryTitle
     * @param dateOnly
     * @param buildingName
     * @param deposit
     * @param location
     * @param street
     * @param score
     * @param parkingDesc
     * @param forLease
     * @param type
     * @param bathroom
     * @param city
     * @param pinCode
     * @param photoAvailable
     * @param totalFloor
     * @param description
     * @param propertySize
     * @param accomodationTypeDesc
     * @param shortUrl
     * @param longitude
     * @param gym
     * @param sharedAccomodation
     * @param shortlistedByLoggedInUser
     * @param propertyTitle
     * @param ownerName
     * @param furnishing
     * @param balconies
     * @param propertyAge
     * @param cupBoard
     * @param powerBackup
     * @param accurateLocation
     * @param adminEvent
     * @param managed
     * @param floor
     * @param amenitiesMap
     * @param inactiveReasonDesc
     * @param swimmingPool
     * @param lift
     * @param availableFrom
     * @param active
     * @param buildingType
     * @param localityId
     * @param latitude
     * @param weight
     * @param ownerId
     * @param loanAvailable
     * @param negotiable
     * @param activationDate
     * @param id
     * @param title
     * @param facingDesc
     * @param propertyCode
     * @param rent
     * @param buildingId
     * @param builderName
     * @param detailUrl
     * @param furnishingDesc
     * @param amenities
     * @param society
     * @param accomodationType
     * @param tenantTypeDesc
     * @param typeDesc
     * @param leaseType
     * @param lastUpdateDate
     * @param photos
     * @param creationDate
     * @param waterSupply
     * @param propertyType
     * @param inactiveReason
     * @param facing
     * @param locality
     * @param nbLocality
     * @param sponsored
     */
    public Datum(String parking, String secondaryTitle, long dateOnly, String buildingName, long deposit, String location, String street, Score score, String parkingDesc, boolean forLease, String type, long bathroom, String city, long pinCode, boolean photoAvailable, long totalFloor, String description, String accomodationTypeDesc, long propertySize, double longitude, String shortUrl, boolean gym, boolean sharedAccomodation, boolean shortlistedByLoggedInUser, String propertyTitle, String ownerName, String furnishing, long balconies, long propertyAge, long cupBoard, String powerBackup, boolean accurateLocation, String adminEvent, Object managed, long floor, AmenitiesMap amenitiesMap, Object inactiveReasonDesc, boolean swimmingPool, boolean lift, long availableFrom, boolean active, String buildingType, String localityId, double latitude, double weight, String ownerId, boolean loanAvailable, boolean negotiable, long activationDate, String id, String facingDesc, String title, Object propertyCode, long rent, String buildingId, String detailUrl, String builderName, String furnishingDesc, String amenities, String society, Object accomodationType, String tenantTypeDesc, String typeDesc, String leaseType, long lastUpdateDate, List<Photo> photos, long creationDate, String waterSupply, String propertyType, Object inactiveReason, String locality, Object facing, String nbLocality, boolean sponsored) {
        super();
        this.parking = parking;
        this.secondaryTitle = secondaryTitle;
        this.dateOnly = dateOnly;
        this.buildingName = buildingName;
        this.deposit = deposit;
        this.location = location;
        this.street = street;
        this.score = score;
        this.parkingDesc = parkingDesc;
        this.forLease = forLease;
        this.type = type;
        this.bathroom = bathroom;
        this.city = city;
        this.pinCode = pinCode;
        this.photoAvailable = photoAvailable;
        this.totalFloor = totalFloor;
        this.description = description;
        this.accomodationTypeDesc = accomodationTypeDesc;
        this.propertySize = propertySize;
        this.longitude = longitude;
        this.shortUrl = shortUrl;
        this.gym = gym;
        this.sharedAccomodation = sharedAccomodation;
        this.shortlistedByLoggedInUser = shortlistedByLoggedInUser;
        this.propertyTitle = propertyTitle;
        this.ownerName = ownerName;
        this.furnishing = furnishing;
        this.balconies = balconies;
        this.propertyAge = propertyAge;
        this.cupBoard = cupBoard;
        this.powerBackup = powerBackup;
        this.accurateLocation = accurateLocation;
        this.adminEvent = adminEvent;
        this.managed = managed;
        this.floor = floor;
        this.amenitiesMap = amenitiesMap;
        this.inactiveReasonDesc = inactiveReasonDesc;
        this.swimmingPool = swimmingPool;
        this.lift = lift;
        this.availableFrom = availableFrom;
        this.active = active;
        this.buildingType = buildingType;
        this.localityId = localityId;
        this.latitude = latitude;
        this.weight = weight;
        this.ownerId = ownerId;
        this.loanAvailable = loanAvailable;
        this.negotiable = negotiable;
        this.activationDate = activationDate;
        this.id = id;
        this.facingDesc = facingDesc;
        this.title = title;
        this.propertyCode = propertyCode;
        this.rent = rent;
        this.buildingId = buildingId;
        this.detailUrl = detailUrl;
        this.builderName = builderName;
        this.furnishingDesc = furnishingDesc;
        this.amenities = amenities;
        this.society = society;
        this.accomodationType = accomodationType;
        this.tenantTypeDesc = tenantTypeDesc;
        this.typeDesc = typeDesc;
        this.leaseType = leaseType;
        this.lastUpdateDate = lastUpdateDate;
        this.photos = photos;
        this.creationDate = creationDate;
        this.waterSupply = waterSupply;
        this.propertyType = propertyType;
        this.inactiveReason = inactiveReason;
        this.locality = locality;
        this.facing = facing;
        this.nbLocality = nbLocality;
        this.sponsored = sponsored;
    }

    public String getParking() {
        return parking;
    }

    public void setParking(String parking) {
        this.parking = parking;
    }

    public String getSecondaryTitle() {
        return secondaryTitle;
    }

    public void setSecondaryTitle(String secondaryTitle) {
        this.secondaryTitle = secondaryTitle;
    }

    public long getDateOnly() {
        return dateOnly;
    }

    public void setDateOnly(long dateOnly) {
        this.dateOnly = dateOnly;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public long getDeposit() {
        return deposit;
    }

    public void setDeposit(long deposit) {
        this.deposit = deposit;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }

    public String getParkingDesc() {
        return parkingDesc;
    }

    public void setParkingDesc(String parkingDesc) {
        this.parkingDesc = parkingDesc;
    }

    public boolean isForLease() {
        return forLease;
    }

    public void setForLease(boolean forLease) {
        this.forLease = forLease;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getBathroom() {
        return bathroom;
    }

    public void setBathroom(long bathroom) {
        this.bathroom = bathroom;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getPinCode() {
        return pinCode;
    }

    public void setPinCode(long pinCode) {
        this.pinCode = pinCode;
    }

    public boolean isPhotoAvailable() {
        return photoAvailable;
    }

    public void setPhotoAvailable(boolean photoAvailable) {
        this.photoAvailable = photoAvailable;
    }

    public long getTotalFloor() {
        return totalFloor;
    }

    public void setTotalFloor(long totalFloor) {
        this.totalFloor = totalFloor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAccomodationTypeDesc() {
        return accomodationTypeDesc;
    }

    public void setAccomodationTypeDesc(String accomodationTypeDesc) {
        this.accomodationTypeDesc = accomodationTypeDesc;
    }

    public long getPropertySize() {
        return propertySize;
    }

    public void setPropertySize(long propertySize) {
        this.propertySize = propertySize;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    public boolean isGym() {
        return gym;
    }

    public void setGym(boolean gym) {
        this.gym = gym;
    }

    public boolean isSharedAccomodation() {
        return sharedAccomodation;
    }

    public void setSharedAccomodation(boolean sharedAccomodation) {
        this.sharedAccomodation = sharedAccomodation;
    }

    public boolean isShortlistedByLoggedInUser() {
        return shortlistedByLoggedInUser;
    }

    public void setShortlistedByLoggedInUser(boolean shortlistedByLoggedInUser) {
        this.shortlistedByLoggedInUser = shortlistedByLoggedInUser;
    }

    public String getPropertyTitle() {
        return propertyTitle;
    }

    public void setPropertyTitle(String propertyTitle) {
        this.propertyTitle = propertyTitle;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getFurnishing() {
        return furnishing;
    }

    public void setFurnishing(String furnishing) {
        this.furnishing = furnishing;
    }

    public long getBalconies() {
        return balconies;
    }

    public void setBalconies(long balconies) {
        this.balconies = balconies;
    }

    public long getPropertyAge() {
        return propertyAge;
    }

    public void setPropertyAge(long propertyAge) {
        this.propertyAge = propertyAge;
    }

    public long getCupBoard() {
        return cupBoard;
    }

    public void setCupBoard(long cupBoard) {
        this.cupBoard = cupBoard;
    }

    public String getPowerBackup() {
        return powerBackup;
    }

    public void setPowerBackup(String powerBackup) {
        this.powerBackup = powerBackup;
    }

    public boolean isAccurateLocation() {
        return accurateLocation;
    }

    public void setAccurateLocation(boolean accurateLocation) {
        this.accurateLocation = accurateLocation;
    }

    public String getAdminEvent() {
        return adminEvent;
    }

    public void setAdminEvent(String adminEvent) {
        this.adminEvent = adminEvent;
    }

    public Object getManaged() {
        return managed;
    }

    public void setManaged(Object managed) {
        this.managed = managed;
    }

    public long getFloor() {
        return floor;
    }

    public void setFloor(long floor) {
        this.floor = floor;
    }

    public AmenitiesMap getAmenitiesMap() {
        return amenitiesMap;
    }

    public void setAmenitiesMap(AmenitiesMap amenitiesMap) {
        this.amenitiesMap = amenitiesMap;
    }

    public Object getInactiveReasonDesc() {
        return inactiveReasonDesc;
    }

    public void setInactiveReasonDesc(Object inactiveReasonDesc) {
        this.inactiveReasonDesc = inactiveReasonDesc;
    }

    public boolean isSwimmingPool() {
        return swimmingPool;
    }

    public void setSwimmingPool(boolean swimmingPool) {
        this.swimmingPool = swimmingPool;
    }

    public boolean isLift() {
        return lift;
    }

    public void setLift(boolean lift) {
        this.lift = lift;
    }

    public long getAvailableFrom() {
        return availableFrom;
    }

    public void setAvailableFrom(long availableFrom) {
        this.availableFrom = availableFrom;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(String buildingType) {
        this.buildingType = buildingType;
    }

    public String getLocalityId() {
        return localityId;
    }

    public void setLocalityId(String localityId) {
        this.localityId = localityId;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public boolean isLoanAvailable() {
        return loanAvailable;
    }

    public void setLoanAvailable(boolean loanAvailable) {
        this.loanAvailable = loanAvailable;
    }

    public boolean isNegotiable() {
        return negotiable;
    }

    public void setNegotiable(boolean negotiable) {
        this.negotiable = negotiable;
    }

    public long getActivationDate() {
        return activationDate;
    }

    public void setActivationDate(long activationDate) {
        this.activationDate = activationDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFacingDesc() {
        return facingDesc;
    }

    public void setFacingDesc(String facingDesc) {
        this.facingDesc = facingDesc;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Object getPropertyCode() {
        return propertyCode;
    }

    public void setPropertyCode(Object propertyCode) {
        this.propertyCode = propertyCode;
    }

    public long getRent() {
        return rent;
    }

    public void setRent(long rent) {
        this.rent = rent;
    }

    public String getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(String buildingId) {
        this.buildingId = buildingId;
    }

    public String getDetailUrl() {
        return detailUrl;
    }

    public void setDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
    }

    public String getBuilderName() {
        return builderName;
    }

    public void setBuilderName(String builderName) {
        this.builderName = builderName;
    }

    public String getFurnishingDesc() {
        return furnishingDesc;
    }

    public void setFurnishingDesc(String furnishingDesc) {
        this.furnishingDesc = furnishingDesc;
    }

    public String getAmenities() {
        return amenities;
    }

    public void setAmenities(String amenities) {
        this.amenities = amenities;
    }

    public String getSociety() {
        return society;
    }

    public void setSociety(String society) {
        this.society = society;
    }

    public Object getAccomodationType() {
        return accomodationType;
    }

    public void setAccomodationType(Object accomodationType) {
        this.accomodationType = accomodationType;
    }

    public String getTenantTypeDesc() {
        return tenantTypeDesc;
    }

    public void setTenantTypeDesc(String tenantTypeDesc) {
        this.tenantTypeDesc = tenantTypeDesc;
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
    }

    public String getLeaseType() {
        return leaseType;
    }

    public void setLeaseType(String leaseType) {
        this.leaseType = leaseType;
    }

    public long getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(long lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    public long getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(long creationDate) {
        this.creationDate = creationDate;
    }

    public String getWaterSupply() {
        return waterSupply;
    }

    public void setWaterSupply(String waterSupply) {
        this.waterSupply = waterSupply;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public Object getInactiveReason() {
        return inactiveReason;
    }

    public void setInactiveReason(Object inactiveReason) {
        this.inactiveReason = inactiveReason;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public Object getFacing() {
        return facing;
    }

    public void setFacing(Object facing) {
        this.facing = facing;
    }

    public String getNbLocality() {
        return nbLocality;
    }

    public void setNbLocality(String nbLocality) {
        this.nbLocality = nbLocality;
    }

    public boolean isSponsored() {
        return sponsored;
    }

    public void setSponsored(boolean sponsored) {
        this.sponsored = sponsored;
    }

    @Override
    public String toString() {
        return "Datum{" +
                "parking='" + parking + '\'' +
                ", secondaryTitle='" + secondaryTitle + '\'' +
                ", dateOnly=" + dateOnly +
                ", buildingName='" + buildingName + '\'' +
                ", deposit=" + deposit +
                ", location='" + location + '\'' +
                ", street='" + street + '\'' +
                ", score=" + score +
                ", parkingDesc='" + parkingDesc + '\'' +
                ", forLease=" + forLease +
                ", type='" + type + '\'' +
                ", bathroom=" + bathroom +
                ", city='" + city + '\'' +
                ", pinCode=" + pinCode +
                ", photoAvailable=" + photoAvailable +
                ", totalFloor=" + totalFloor +
                ", description='" + description + '\'' +
                ", accomodationTypeDesc='" + accomodationTypeDesc + '\'' +
                ", propertySize=" + propertySize +
                ", longitude=" + longitude +
                ", shortUrl='" + shortUrl + '\'' +
                ", gym=" + gym +
                ", sharedAccomodation=" + sharedAccomodation +
                ", shortlistedByLoggedInUser=" + shortlistedByLoggedInUser +
                ", propertyTitle='" + propertyTitle + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", furnishing='" + furnishing + '\'' +
                ", balconies=" + balconies +
                ", propertyAge=" + propertyAge +
                ", cupBoard=" + cupBoard +
                ", powerBackup='" + powerBackup + '\'' +
                ", accurateLocation=" + accurateLocation +
                ", adminEvent='" + adminEvent + '\'' +
                ", managed=" + managed +
                ", floor=" + floor +
                ", amenitiesMap=" + amenitiesMap +
                ", inactiveReasonDesc=" + inactiveReasonDesc +
                ", swimmingPool=" + swimmingPool +
                ", lift=" + lift +
                ", availableFrom=" + availableFrom +
                ", active=" + active +
                ", buildingType='" + buildingType + '\'' +
                ", localityId='" + localityId + '\'' +
                ", latitude=" + latitude +
                ", weight=" + weight +
                ", ownerId='" + ownerId + '\'' +
                ", loanAvailable=" + loanAvailable +
                ", negotiable=" + negotiable +
                ", activationDate=" + activationDate +
                ", id='" + id + '\'' +
                ", facingDesc='" + facingDesc + '\'' +
                ", title='" + title + '\'' +
                ", propertyCode=" + propertyCode +
                ", rent=" + rent +
                ", buildingId='" + buildingId + '\'' +
                ", detailUrl='" + detailUrl + '\'' +
                ", builderName='" + builderName + '\'' +
                ", furnishingDesc='" + furnishingDesc + '\'' +
                ", amenities='" + amenities + '\'' +
                ", society='" + society + '\'' +
                ", accomodationType=" + accomodationType +
                ", tenantTypeDesc='" + tenantTypeDesc + '\'' +
                ", typeDesc='" + typeDesc + '\'' +
                ", leaseType='" + leaseType + '\'' +
                ", lastUpdateDate=" + lastUpdateDate +
                ", photos=" + photos +
                ", creationDate=" + creationDate +
                ", waterSupply='" + waterSupply + '\'' +
                ", propertyType='" + propertyType + '\'' +
                ", inactiveReason=" + inactiveReason +
                ", locality='" + locality + '\'' +
                ", facing=" + facing +
                ", nbLocality='" + nbLocality + '\'' +
                ", sponsored=" + sponsored +
                '}';
    }
}
