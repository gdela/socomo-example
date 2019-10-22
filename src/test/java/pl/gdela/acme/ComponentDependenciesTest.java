package pl.gdela.acme;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.junit.ArchUnitRunner;
import com.tngtech.archunit.lang.ArchRule;
import org.junit.runner.RunWith;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.library.dependencies.SlicesRuleDefinition.slices;

@RunWith(ArchUnitRunner.class)
@AnalyzeClasses(packages = "pl.gdela.acme")
public class ComponentDependenciesTest {

    private final static String CATALOG = "..orders..";
    private final static String COURIERS = "..couriers..";
    private final static String INVENTORY = "..inventory..";
    private final static String INVOICING = "..invoicing..";
    private final static String ORDERS = "..orders..";
    private final static String SHIPPING = "..shipping..";

    @ArchTest
    public ArchRule noCyclesBetweenComponents =
            slices().matching("pl.gdela.acme.(*)..").should().beFreeOfCycles();

    @ArchTest
    public ArchRule rule1 =
            classes().that().resideInAPackage(COURIERS)
            .should().onlyBeAccessed().byAnyPackage(SHIPPING);

    @ArchTest
    public ArchRule rule2 =
            classes().that().resideInAPackage(INVENTORY)
            .should().onlyBeAccessed().byAnyPackage(ORDERS, SHIPPING);

    @ArchTest
    public ArchRule rule3 =
            classes().that().resideInAPackage(ORDERS)
            .should().onlyBeAccessed().byAnyPackage();
}
