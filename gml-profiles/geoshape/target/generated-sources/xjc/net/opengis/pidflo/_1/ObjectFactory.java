//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.06.14 时间 01:09:07 PM CST 
//


package net.opengis.pidflo._1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.opengis.pidflo._1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Circle_QNAME = new QName("http://www.opengis.net/pidflo/1.0", "Circle");
    private final static QName _Ellipse_QNAME = new QName("http://www.opengis.net/pidflo/1.0", "Ellipse");
    private final static QName _ArcBand_QNAME = new QName("http://www.opengis.net/pidflo/1.0", "ArcBand");
    private final static QName _Prism_QNAME = new QName("http://www.opengis.net/pidflo/1.0", "Prism");
    private final static QName _Sphere_QNAME = new QName("http://www.opengis.net/pidflo/1.0", "Sphere");
    private final static QName _Ellipsoid_QNAME = new QName("http://www.opengis.net/pidflo/1.0", "Ellipsoid");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.opengis.pidflo._1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CircleType }
     * 
     */
    public CircleType createCircleType() {
        return new CircleType();
    }

    /**
     * Create an instance of {@link EllipseType }
     * 
     */
    public EllipseType createEllipseType() {
        return new EllipseType();
    }

    /**
     * Create an instance of {@link ArcBandType }
     * 
     */
    public ArcBandType createArcBandType() {
        return new ArcBandType();
    }

    /**
     * Create an instance of {@link PrismType }
     * 
     */
    public PrismType createPrismType() {
        return new PrismType();
    }

    /**
     * Create an instance of {@link SphereType }
     * 
     */
    public SphereType createSphereType() {
        return new SphereType();
    }

    /**
     * Create an instance of {@link EllipsoidType }
     * 
     */
    public EllipsoidType createEllipsoidType() {
        return new EllipsoidType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CircleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/pidflo/1.0", name = "Circle", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_Surface")
    public JAXBElement<CircleType> createCircle(CircleType value) {
        return new JAXBElement<CircleType>(_Circle_QNAME, CircleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EllipseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/pidflo/1.0", name = "Ellipse", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_Surface")
    public JAXBElement<EllipseType> createEllipse(EllipseType value) {
        return new JAXBElement<EllipseType>(_Ellipse_QNAME, EllipseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArcBandType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/pidflo/1.0", name = "ArcBand", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_Surface")
    public JAXBElement<ArcBandType> createArcBand(ArcBandType value) {
        return new JAXBElement<ArcBandType>(_ArcBand_QNAME, ArcBandType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrismType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/pidflo/1.0", name = "Prism", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_Solid")
    public JAXBElement<PrismType> createPrism(PrismType value) {
        return new JAXBElement<PrismType>(_Prism_QNAME, PrismType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SphereType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/pidflo/1.0", name = "Sphere", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_Solid")
    public JAXBElement<SphereType> createSphere(SphereType value) {
        return new JAXBElement<SphereType>(_Sphere_QNAME, SphereType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EllipsoidType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/pidflo/1.0", name = "Ellipsoid", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_Solid")
    public JAXBElement<EllipsoidType> createEllipsoid(EllipsoidType value) {
        return new JAXBElement<EllipsoidType>(_Ellipsoid_QNAME, EllipsoidType.class, null, value);
    }

}
