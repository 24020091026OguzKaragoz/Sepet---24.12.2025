package org.t3tracon.sepet;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.text.Text;
import org.t3tracon.classes.MobilePhone;
import org.t3tracon.classes.Bread;
import org.t3tracon.classes.Textile;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.math.BigDecimal;

public class HelloController {

    //CREATING 4 PHONES
    MobilePhone iPhone17 = new MobilePhone(
            "iPhone 17",
            29163.5,
            "Apple",
            "A19, 8GB RAM, 256GB Storage"
    );

    MobilePhone iPhoneAir = new MobilePhone(
            "iPhone Air",
            36463.5,
            "Apple",
            "A19 Pro, 12GB RAM, 256GB Storage"
    );

    MobilePhone iPhone17Pro = new MobilePhone(
            "iPhone 17 Pro",
            40113.5,
            "Apple",
            "A19 Pro, 12GB RAM, 256GB Storage"
    );

    MobilePhone iPhone17ProMax = new MobilePhone(
            "iPhone 17 Pro Max",
            43763.5,
            "Apple",
            "A19 Pro, 12GB RAM, 256GB Storage"
    );

    //CREATING 4 BREADS
    Bread bread1 = new Bread(
            "White Bread",
            12.50,
            "Sourdough",
            250.0
    );

    Bread bread2 = new Bread(
            "Whole Wheat",
            25.00,
            "Artisan",
            400.0);

    Bread bread3 = new Bread(
            "Rye Bread",
            35.00,
            "Dark Rye",
            500.0);

    Bread bread4 = new Bread(
            "French Baguette",
            20.00,
            "Traditional",
            300.0);

    //CREATING 4 TEXTILE PRODUCT
    Textile shirt1 = new Textile(
            "Basic T-Shirt",
            350.00,
            "100% Cotton",
            "XL",
            "TextileCorp Ind."
    );

    Textile pants1 = new Textile(
            "Slim Fit Jeans",
            850.00,
            "Denim",
            "32/34",
            "BlueDenim Co."
    );

    Textile sweater1 = new Textile(
            "Winter Sweater",
            650.00,
            "Wool Blend",
            "M",
            "KnitWear Ltd."
    );


    Textile shirt2 = new Textile(
            "Casual Shirt",
            750.00,
            "Linen",
            "2XL",
            "Global Fashion Group"
    );

    @FXML
    private ListView<String> basketList;
    @FXML
    private Text phoneSpecsField;
    @FXML
    private Text textileSpecsField;
    @FXML
    private Text breadSpecsField;
    @FXML
    private ChoiceBox<String> modelChoiceBox;
    @FXML
    private ChoiceBox<String> textileChoiceBox;
    @FXML
    private ChoiceBox<String> breadChoiceBox;
    @FXML
    private Text barePrice;
    @FXML
    private Text kdv;
    @FXML
    private Text finalPrice;
    @FXML
    private Text totalPrice;

    //products that inside of basket
    private ObservableList<String> products = FXCollections.observableArrayList();

    //array that holds phones
    private ObservableList<String> phoneModels = FXCollections.observableArrayList(iPhone17.getName(), iPhoneAir.getName(), iPhone17Pro.getName(), iPhone17ProMax.getName());

    //array that holds textile products
    private ObservableList<String> breads = FXCollections.observableArrayList(bread1.getName(), bread2.getName(), bread3.getName(), bread4.getName());

    //array that holds textile products
    private ObservableList<String> textileProducts = FXCollections.observableArrayList(shirt1.getName(), pants1.getName(), sweater1.getName(), shirt2.getName());

    //UPDATE PHONE SPECS FIELD
    public void phoneUpdateSpecsText(String selectedModel) {
        if (selectedModel == null) {
            phoneSpecsField.setText("");
            return;
        }

        switch (selectedModel) {
            case "iPhone 17":
                phoneSpecsField.setText(iPhone17.getProperties() + "\nPrice: " + iPhone17.getPrice() + "₺");
                break;
            case "iPhone Air":
                phoneSpecsField.setText(iPhoneAir.getProperties() + "\nPrice: " + iPhoneAir.getPrice() + "₺");
                break;
            case "iPhone 17 Pro":
                phoneSpecsField.setText(iPhone17Pro.getProperties() + "\nPrice: " + iPhone17Pro.getPrice() + "₺");
                break;
            case "iPhone 17 Pro Max":
                phoneSpecsField.setText(iPhone17ProMax.getProperties() + "\nPrice: " + iPhone17ProMax.getPrice() + "₺");
                break;
            default:
                phoneSpecsField.setText("");
                break;


        }
    }

    //UPDATES TEXTILE SPECS FIELD
    public void textileUpdateSpecsText(String selectedTextile) {
        if (selectedTextile == null) {
            textileSpecsField.setText("");
        }

        switch (selectedTextile) {
            case "Basic T-Shirt":
                textileSpecsField.setText(shirt1.getFabricType() + ", " + shirt1.getSize() + ", " + shirt1.getManufacturer() + "\nPrice: " + shirt1.getPrice());
                break;
            case "Slim Fit Jeans":
                textileSpecsField.setText(pants1.getFabricType() + ", " + pants1.getSize() + ", " + pants1.getManufacturer() + "\nPrice: " + pants1.getPrice());
                break;
            case "Winter Sweater":
                textileSpecsField.setText(sweater1.getFabricType() + ", " + sweater1.getSize() + ", " + sweater1.getManufacturer() + "\nPrice: " + sweater1.getPrice());
                break;
            case "Casual Shirt":
                textileSpecsField.setText(shirt2.getFabricType() + ", " + shirt2.getSize() + ", " + shirt2.getManufacturer() + "\nPrice: " + shirt2.getPrice());
                break;
            default:
                textileSpecsField.setText("");
                break;
        }
    }

    //UPDATES BREAD SPECS FIELD
    public void breadUpdateSpecsText(String selectedBread) {
        if (selectedBread == null) {
            breadSpecsField.setText("");
        }

        switch (selectedBread) {
            case "White Bread":
                breadSpecsField.setText(bread1.getType() + ", " + bread1.getWeight() + "\nPrice: " + bread1.getPrice());
                break;
            case "Whole Wheat":
                breadSpecsField.setText(bread2.getType() + ", " + bread2.getWeight() + "\nPrice: " + bread2.getPrice());
                break;
            case "Rye Bread":
                breadSpecsField.setText(bread3.getType() + ", " + bread3.getWeight() + "\nPrice" + bread3.getPrice());
                break;
            case "French Baguette":
                breadSpecsField.setText(bread4.getType() + ", " + bread4.getWeight() + "\nPrice" + bread4.getPrice());
                break;
            default:
                breadSpecsField.setText("");
                break;
        }
    }

    public void initialize() {
        //SETTING ITEMS OF EACH CHOICE BOX
        modelChoiceBox.setItems(phoneModels);
        textileChoiceBox.setItems(textileProducts);
        breadChoiceBox.setItems(breads);

        //
        basketList.setItems(products);

        //listens then updates the phones
        modelChoiceBox.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            phoneUpdateSpecsText(newValue);
        });

        textileChoiceBox.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            textileUpdateSpecsText(newValue);
        });

        breadChoiceBox.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            breadUpdateSpecsText(newValue);
        });

        basketList.getSelectionModel().selectedItemProperty().addListener((observableValue, oldValue, newValue) -> {
            updatePriceTexts();
        });
    }

    @FXML
    public void addPhone() {
        String phone = modelChoiceBox.getSelectionModel().getSelectedItem();
        products.add(phone);
        calculateBasketTotal();
    }

    @FXML
    public void addTextile() {
        String textile = textileChoiceBox.getSelectionModel().getSelectedItem();
        products.add(textile);
        calculateBasketTotal();
    }

    @FXML
    public void addBread() {
        String bread = breadChoiceBox.getSelectionModel().getSelectedItem();
        products.add(bread);
        calculateBasketTotal();
    }

    @FXML
    public void removeProduct() {
        String selectedItem = basketList.getSelectionModel().getSelectedItem();
        products.remove(selectedItem);
        calculateBasketTotal();
    }

    @FXML
    public void updatePriceTexts() {
        String selectedItem = basketList.getSelectionModel().getSelectedItem();
        switch (selectedItem) {
            case "iPhone 17":
                barePrice.setText(String.valueOf(iPhone17.getPrice()) + "TL");
                kdv.setText(String.valueOf(iPhone17.calculateKdvAmount(BigDecimal.valueOf(iPhone17.getPrice()), BigDecimal.valueOf(18.0))) + "TL");
                finalPrice.setText(String.valueOf(iPhone17SellingPrice) + "TL");
                break;
            case "iPhone Air":
                barePrice.setText(String.valueOf(iPhoneAir.getPrice()) + "TL");
                kdv.setText(String.valueOf(iPhoneAir.calculateKdvAmount(BigDecimal.valueOf(iPhoneAir.getPrice()), BigDecimal.valueOf(20.0))) + "TL");
                finalPrice.setText(String.valueOf(iPhoneAirSellingPrice) + "TL");
                break;
            case "iPhone 17 Pro":
                barePrice.setText(String.valueOf(iPhone17Pro.getPrice()) + "TL");
                kdv.setText(String.valueOf(iPhone17Pro.calculateKdvAmount(BigDecimal.valueOf(iPhone17Pro.getPrice()), BigDecimal.valueOf(18.0))) + "TL");
                finalPrice.setText(String.valueOf(iPhone17ProSellingPrice) + "TL");
                break;
            case "iPhone 17 Pro Max":
                barePrice.setText(String.valueOf(iPhone17ProMax.getPrice()) + "TL");
                kdv.setText(String.valueOf(iPhone17ProMax.calculateKdvAmount(BigDecimal.valueOf(iPhone17ProMax.getPrice()), BigDecimal.valueOf(20.0))) + "TL");
                finalPrice.setText(String.valueOf(iPhone17ProMaxSellingPrice) + "TL");
                break;
            case "White Bread":
                barePrice.setText(String.valueOf(bread1.getPrice()) + "TL");
                kdv.setText(String.valueOf(bread1.calculateKdvAmount(BigDecimal.valueOf(bread1.getPrice()), BigDecimal.valueOf(0.0))) + "TL");
                finalPrice.setText(String.valueOf(bread1SellingPrice) + "TL");
                break;
            case "Whole Wheat":
                barePrice.setText(String.valueOf(bread2.getPrice()) + "TL");
                kdv.setText(String.valueOf(bread2.calculateKdvAmount(BigDecimal.valueOf(bread2.getPrice()), BigDecimal.valueOf(0.0))) + "TL");
                finalPrice.setText(String.valueOf(bread2SellingPrice) + "TL");
                break;
            case "Rye Bread":
                barePrice.setText(String.valueOf(bread3.getPrice()) + "TL");
                kdv.setText(String.valueOf(bread3.calculateKdvAmount(BigDecimal.valueOf(bread3.getPrice()), BigDecimal.valueOf(0.0))) + "TL");
                finalPrice.setText(String.valueOf(bread3SellingPrice) + "TL");
                break;
            case "French Baguette":
                barePrice.setText(String.valueOf(bread4.getPrice()) + "TL");
                kdv.setText(String.valueOf(bread4.calculateKdvAmount(BigDecimal.valueOf(bread4.getPrice()), BigDecimal.valueOf(0.0))) + "TL");
                finalPrice.setText(String.valueOf(bread4SellingPrice) + "TL");
                break;
            case "Basic T-Shirt":
                barePrice.setText(String.valueOf(shirt1.getPrice()) + "TL");
                kdv.setText(String.valueOf(shirt1.calculateKdvAmount(BigDecimal.valueOf(shirt1.getPrice()), BigDecimal.valueOf(20.0))) + "TL");
                finalPrice.setText(String.valueOf(shirt1SellingPrice) + "TL");
                break;
            case "Slim Fit Jeans":
                barePrice.setText(String.valueOf(pants1.getPrice()) + "TL");
                kdv.setText(String.valueOf(pants1.calculateKdvAmount(BigDecimal.valueOf(pants1.getPrice()), BigDecimal.valueOf(20.0))) + "TL");
                finalPrice.setText(String.valueOf(pants1SellingPrice) + "TL");
                break;
            case "Winter Sweater":
                barePrice.setText(String.valueOf(sweater1.getPrice()) + "TL");
                kdv.setText(String.valueOf(sweater1.calculateKdvAmount(BigDecimal.valueOf(sweater1.getPrice()), BigDecimal.valueOf(20.0))) + "TL");
                finalPrice.setText(String.valueOf(sweater1SellingPrice) + "TL");
                break;
            case "Casual Shirt":
                barePrice.setText(String.valueOf(shirt2.getPrice()) + "TL");
                kdv.setText(String.valueOf(shirt2.calculateKdvAmount(BigDecimal.valueOf(shirt2.getPrice()), BigDecimal.valueOf(20.0))) + "TL");
                finalPrice.setText(String.valueOf(shirt2SellingPrice) + "TL");
                break;
        }
    }

    private Double getSellingPrice(Double price, Double kdv) {
        return price + (price*kdv)/100;
    }

    public void calculateBasketTotal() {
        double total = 0.0;

        for (String item : basketList.getItems()) {
            switch (item) {
                case "iPhone 17":
                    total += iPhone17SellingPrice;
                    break;
                case "iPhone Air":
                    total += iPhoneAirSellingPrice;
                    break;
                case "iPhone 17 Pro":
                    total += iPhone17ProSellingPrice;
                    break;
                case "iPhone 17 Pro Max":
                    total += iPhone17ProMaxSellingPrice;
                    break;
                case "White Bread":
                    total += bread1SellingPrice;
                    break;
                case "Whole Wheat":
                    total += bread2SellingPrice;
                    break;
                case "Rye Bread":
                    total += bread3SellingPrice;
                    break;
                case "French Baguette":
                    total += bread4SellingPrice;
                    break;
                case "Basic T-Shirt":
                    total += shirt1SellingPrice;
                    break;
                case "Slim Fit Jeans":
                    total += pants1SellingPrice;
                    break;
                case "Winter Sweater":
                    total += sweater1SellingPrice;
                    break;
                case "Casual Shirt":
                    total += shirt2SellingPrice;
                    break;
            }
        }
        totalPrice.setText(String.format("%.2f TL", total));
    }

    private final Double iPhone17SellingPrice = getSellingPrice(iPhone17.getPrice(), 18.0);
    private final Double iPhoneAirSellingPrice = getSellingPrice(iPhoneAir.getPrice(), 20.0);
    private final Double iPhone17ProSellingPrice = getSellingPrice(iPhone17Pro.getPrice(), 18.0);
    private final Double iPhone17ProMaxSellingPrice = getSellingPrice(iPhone17ProMax.getPrice(), 20.0);

    private final Double bread1SellingPrice = getSellingPrice(bread1.getPrice(), 0.0);
    private final Double bread2SellingPrice = getSellingPrice(bread2.getPrice(), 0.0);
    private final Double bread3SellingPrice = getSellingPrice(bread3.getPrice(), 0.0);
    private final Double bread4SellingPrice = getSellingPrice(bread4.getPrice(), 0.0);

    private final Double shirt1SellingPrice = getSellingPrice(shirt1.getPrice(), 20.0);
    private final Double pants1SellingPrice = getSellingPrice(pants1.getPrice(), 20.0);
    private final Double sweater1SellingPrice = getSellingPrice(sweater1.getPrice(), 20.0);
    private final Double shirt2SellingPrice = getSellingPrice(shirt2.getPrice(), 20.0);
}