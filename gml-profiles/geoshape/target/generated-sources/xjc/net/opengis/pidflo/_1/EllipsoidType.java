//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.06.14 时间 01:09:07 PM CST 
//


package net.opengis.pidflo._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.v_3_1_1.AbstractSolidType;
import net.opengis.gml.v_3_1_1.AngleType;
import net.opengis.gml.v_3_1_1.DirectPositionType;
import net.opengis.gml.v_3_1_1.LengthType;
import net.opengis.gml.v_3_1_1.PointPropertyType;
import org.jvnet.jaxb2_commons.lang.CopyStrategy2;
import org.jvnet.jaxb2_commons.lang.CopyTo2;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBMergeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.MergeFrom2;
import org.jvnet.jaxb2_commons.lang.MergeStrategy2;
import org.jvnet.jaxb2_commons.lang.ToString2;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy2;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>EllipsoidType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="EllipsoidType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractSolidType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.opengis.net/pidflo/1.0}centerGroup"/&gt;
 *         &lt;element name="semiMajorAxis" type="{http://www.opengis.net/gml}LengthType"/&gt;
 *         &lt;element name="semiMinorAxis" type="{http://www.opengis.net/gml}LengthType"/&gt;
 *         &lt;element name="verticalAxis" type="{http://www.opengis.net/gml}LengthType"/&gt;
 *         &lt;element name="orientation" type="{http://www.opengis.net/gml}AngleType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EllipsoidType", propOrder = {
    "pos",
    "pointProperty",
    "semiMajorAxis",
    "semiMinorAxis",
    "verticalAxis",
    "orientation"
})
public class EllipsoidType
    extends AbstractSolidType
    implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    @XmlElement(namespace = "http://www.opengis.net/gml")
    protected DirectPositionType pos;
    @XmlElement(namespace = "http://www.opengis.net/gml")
    protected PointPropertyType pointProperty;
    @XmlElement(required = true)
    protected LengthType semiMajorAxis;
    @XmlElement(required = true)
    protected LengthType semiMinorAxis;
    @XmlElement(required = true)
    protected LengthType verticalAxis;
    @XmlElement(required = true)
    protected AngleType orientation;

    /**
     * 获取pos属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DirectPositionType }
     *     
     */
    public DirectPositionType getPos() {
        return pos;
    }

    /**
     * 设置pos属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DirectPositionType }
     *     
     */
    public void setPos(DirectPositionType value) {
        this.pos = value;
    }

    public boolean isSetPos() {
        return (this.pos!= null);
    }

    /**
     * 获取pointProperty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PointPropertyType }
     *     
     */
    public PointPropertyType getPointProperty() {
        return pointProperty;
    }

    /**
     * 设置pointProperty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PointPropertyType }
     *     
     */
    public void setPointProperty(PointPropertyType value) {
        this.pointProperty = value;
    }

    public boolean isSetPointProperty() {
        return (this.pointProperty!= null);
    }

    /**
     * 获取semiMajorAxis属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getSemiMajorAxis() {
        return semiMajorAxis;
    }

    /**
     * 设置semiMajorAxis属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setSemiMajorAxis(LengthType value) {
        this.semiMajorAxis = value;
    }

    public boolean isSetSemiMajorAxis() {
        return (this.semiMajorAxis!= null);
    }

    /**
     * 获取semiMinorAxis属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getSemiMinorAxis() {
        return semiMinorAxis;
    }

    /**
     * 设置semiMinorAxis属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setSemiMinorAxis(LengthType value) {
        this.semiMinorAxis = value;
    }

    public boolean isSetSemiMinorAxis() {
        return (this.semiMinorAxis!= null);
    }

    /**
     * 获取verticalAxis属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getVerticalAxis() {
        return verticalAxis;
    }

    /**
     * 设置verticalAxis属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setVerticalAxis(LengthType value) {
        this.verticalAxis = value;
    }

    public boolean isSetVerticalAxis() {
        return (this.verticalAxis!= null);
    }

    /**
     * 获取orientation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AngleType }
     *     
     */
    public AngleType getOrientation() {
        return orientation;
    }

    /**
     * 设置orientation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AngleType }
     *     
     */
    public void setOrientation(AngleType value) {
        this.orientation = value;
    }

    public boolean isSetOrientation() {
        return (this.orientation!= null);
    }

    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            DirectPositionType thePos;
            thePos = this.getPos();
            strategy.appendField(locator, this, "pos", buffer, thePos, this.isSetPos());
        }
        {
            PointPropertyType thePointProperty;
            thePointProperty = this.getPointProperty();
            strategy.appendField(locator, this, "pointProperty", buffer, thePointProperty, this.isSetPointProperty());
        }
        {
            LengthType theSemiMajorAxis;
            theSemiMajorAxis = this.getSemiMajorAxis();
            strategy.appendField(locator, this, "semiMajorAxis", buffer, theSemiMajorAxis, this.isSetSemiMajorAxis());
        }
        {
            LengthType theSemiMinorAxis;
            theSemiMinorAxis = this.getSemiMinorAxis();
            strategy.appendField(locator, this, "semiMinorAxis", buffer, theSemiMinorAxis, this.isSetSemiMinorAxis());
        }
        {
            LengthType theVerticalAxis;
            theVerticalAxis = this.getVerticalAxis();
            strategy.appendField(locator, this, "verticalAxis", buffer, theVerticalAxis, this.isSetVerticalAxis());
        }
        {
            AngleType theOrientation;
            theOrientation = this.getOrientation();
            strategy.appendField(locator, this, "orientation", buffer, theOrientation, this.isSetOrientation());
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final EllipsoidType that = ((EllipsoidType) object);
        {
            DirectPositionType lhsPos;
            lhsPos = this.getPos();
            DirectPositionType rhsPos;
            rhsPos = that.getPos();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pos", lhsPos), LocatorUtils.property(thatLocator, "pos", rhsPos), lhsPos, rhsPos, this.isSetPos(), that.isSetPos())) {
                return false;
            }
        }
        {
            PointPropertyType lhsPointProperty;
            lhsPointProperty = this.getPointProperty();
            PointPropertyType rhsPointProperty;
            rhsPointProperty = that.getPointProperty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pointProperty", lhsPointProperty), LocatorUtils.property(thatLocator, "pointProperty", rhsPointProperty), lhsPointProperty, rhsPointProperty, this.isSetPointProperty(), that.isSetPointProperty())) {
                return false;
            }
        }
        {
            LengthType lhsSemiMajorAxis;
            lhsSemiMajorAxis = this.getSemiMajorAxis();
            LengthType rhsSemiMajorAxis;
            rhsSemiMajorAxis = that.getSemiMajorAxis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "semiMajorAxis", lhsSemiMajorAxis), LocatorUtils.property(thatLocator, "semiMajorAxis", rhsSemiMajorAxis), lhsSemiMajorAxis, rhsSemiMajorAxis, this.isSetSemiMajorAxis(), that.isSetSemiMajorAxis())) {
                return false;
            }
        }
        {
            LengthType lhsSemiMinorAxis;
            lhsSemiMinorAxis = this.getSemiMinorAxis();
            LengthType rhsSemiMinorAxis;
            rhsSemiMinorAxis = that.getSemiMinorAxis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "semiMinorAxis", lhsSemiMinorAxis), LocatorUtils.property(thatLocator, "semiMinorAxis", rhsSemiMinorAxis), lhsSemiMinorAxis, rhsSemiMinorAxis, this.isSetSemiMinorAxis(), that.isSetSemiMinorAxis())) {
                return false;
            }
        }
        {
            LengthType lhsVerticalAxis;
            lhsVerticalAxis = this.getVerticalAxis();
            LengthType rhsVerticalAxis;
            rhsVerticalAxis = that.getVerticalAxis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "verticalAxis", lhsVerticalAxis), LocatorUtils.property(thatLocator, "verticalAxis", rhsVerticalAxis), lhsVerticalAxis, rhsVerticalAxis, this.isSetVerticalAxis(), that.isSetVerticalAxis())) {
                return false;
            }
        }
        {
            AngleType lhsOrientation;
            lhsOrientation = this.getOrientation();
            AngleType rhsOrientation;
            rhsOrientation = that.getOrientation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orientation", lhsOrientation), LocatorUtils.property(thatLocator, "orientation", rhsOrientation), lhsOrientation, rhsOrientation, this.isSetOrientation(), that.isSetOrientation())) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            DirectPositionType thePos;
            thePos = this.getPos();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pos", thePos), currentHashCode, thePos, this.isSetPos());
        }
        {
            PointPropertyType thePointProperty;
            thePointProperty = this.getPointProperty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pointProperty", thePointProperty), currentHashCode, thePointProperty, this.isSetPointProperty());
        }
        {
            LengthType theSemiMajorAxis;
            theSemiMajorAxis = this.getSemiMajorAxis();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "semiMajorAxis", theSemiMajorAxis), currentHashCode, theSemiMajorAxis, this.isSetSemiMajorAxis());
        }
        {
            LengthType theSemiMinorAxis;
            theSemiMinorAxis = this.getSemiMinorAxis();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "semiMinorAxis", theSemiMinorAxis), currentHashCode, theSemiMinorAxis, this.isSetSemiMinorAxis());
        }
        {
            LengthType theVerticalAxis;
            theVerticalAxis = this.getVerticalAxis();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "verticalAxis", theVerticalAxis), currentHashCode, theVerticalAxis, this.isSetVerticalAxis());
        }
        {
            AngleType theOrientation;
            theOrientation = this.getOrientation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orientation", theOrientation), currentHashCode, theOrientation, this.isSetOrientation());
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        super.copyTo(locator, draftCopy, strategy);
        if (draftCopy instanceof EllipsoidType) {
            final EllipsoidType copy = ((EllipsoidType) draftCopy);
            {
                Boolean posShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetPos());
                if (posShouldBeCopiedAndSet == Boolean.TRUE) {
                    DirectPositionType sourcePos;
                    sourcePos = this.getPos();
                    DirectPositionType copyPos = ((DirectPositionType) strategy.copy(LocatorUtils.property(locator, "pos", sourcePos), sourcePos, this.isSetPos()));
                    copy.setPos(copyPos);
                } else {
                    if (posShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.pos = null;
                    }
                }
            }
            {
                Boolean pointPropertyShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetPointProperty());
                if (pointPropertyShouldBeCopiedAndSet == Boolean.TRUE) {
                    PointPropertyType sourcePointProperty;
                    sourcePointProperty = this.getPointProperty();
                    PointPropertyType copyPointProperty = ((PointPropertyType) strategy.copy(LocatorUtils.property(locator, "pointProperty", sourcePointProperty), sourcePointProperty, this.isSetPointProperty()));
                    copy.setPointProperty(copyPointProperty);
                } else {
                    if (pointPropertyShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.pointProperty = null;
                    }
                }
            }
            {
                Boolean semiMajorAxisShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetSemiMajorAxis());
                if (semiMajorAxisShouldBeCopiedAndSet == Boolean.TRUE) {
                    LengthType sourceSemiMajorAxis;
                    sourceSemiMajorAxis = this.getSemiMajorAxis();
                    LengthType copySemiMajorAxis = ((LengthType) strategy.copy(LocatorUtils.property(locator, "semiMajorAxis", sourceSemiMajorAxis), sourceSemiMajorAxis, this.isSetSemiMajorAxis()));
                    copy.setSemiMajorAxis(copySemiMajorAxis);
                } else {
                    if (semiMajorAxisShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.semiMajorAxis = null;
                    }
                }
            }
            {
                Boolean semiMinorAxisShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetSemiMinorAxis());
                if (semiMinorAxisShouldBeCopiedAndSet == Boolean.TRUE) {
                    LengthType sourceSemiMinorAxis;
                    sourceSemiMinorAxis = this.getSemiMinorAxis();
                    LengthType copySemiMinorAxis = ((LengthType) strategy.copy(LocatorUtils.property(locator, "semiMinorAxis", sourceSemiMinorAxis), sourceSemiMinorAxis, this.isSetSemiMinorAxis()));
                    copy.setSemiMinorAxis(copySemiMinorAxis);
                } else {
                    if (semiMinorAxisShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.semiMinorAxis = null;
                    }
                }
            }
            {
                Boolean verticalAxisShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetVerticalAxis());
                if (verticalAxisShouldBeCopiedAndSet == Boolean.TRUE) {
                    LengthType sourceVerticalAxis;
                    sourceVerticalAxis = this.getVerticalAxis();
                    LengthType copyVerticalAxis = ((LengthType) strategy.copy(LocatorUtils.property(locator, "verticalAxis", sourceVerticalAxis), sourceVerticalAxis, this.isSetVerticalAxis()));
                    copy.setVerticalAxis(copyVerticalAxis);
                } else {
                    if (verticalAxisShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.verticalAxis = null;
                    }
                }
            }
            {
                Boolean orientationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetOrientation());
                if (orientationShouldBeCopiedAndSet == Boolean.TRUE) {
                    AngleType sourceOrientation;
                    sourceOrientation = this.getOrientation();
                    AngleType copyOrientation = ((AngleType) strategy.copy(LocatorUtils.property(locator, "orientation", sourceOrientation), sourceOrientation, this.isSetOrientation()));
                    copy.setOrientation(copyOrientation);
                } else {
                    if (orientationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.orientation = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new EllipsoidType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof EllipsoidType) {
            final EllipsoidType target = this;
            final EllipsoidType leftObject = ((EllipsoidType) left);
            final EllipsoidType rightObject = ((EllipsoidType) right);
            {
                Boolean posShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetPos(), rightObject.isSetPos());
                if (posShouldBeMergedAndSet == Boolean.TRUE) {
                    DirectPositionType lhsPos;
                    lhsPos = leftObject.getPos();
                    DirectPositionType rhsPos;
                    rhsPos = rightObject.getPos();
                    DirectPositionType mergedPos = ((DirectPositionType) strategy.merge(LocatorUtils.property(leftLocator, "pos", lhsPos), LocatorUtils.property(rightLocator, "pos", rhsPos), lhsPos, rhsPos, leftObject.isSetPos(), rightObject.isSetPos()));
                    target.setPos(mergedPos);
                } else {
                    if (posShouldBeMergedAndSet == Boolean.FALSE) {
                        target.pos = null;
                    }
                }
            }
            {
                Boolean pointPropertyShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetPointProperty(), rightObject.isSetPointProperty());
                if (pointPropertyShouldBeMergedAndSet == Boolean.TRUE) {
                    PointPropertyType lhsPointProperty;
                    lhsPointProperty = leftObject.getPointProperty();
                    PointPropertyType rhsPointProperty;
                    rhsPointProperty = rightObject.getPointProperty();
                    PointPropertyType mergedPointProperty = ((PointPropertyType) strategy.merge(LocatorUtils.property(leftLocator, "pointProperty", lhsPointProperty), LocatorUtils.property(rightLocator, "pointProperty", rhsPointProperty), lhsPointProperty, rhsPointProperty, leftObject.isSetPointProperty(), rightObject.isSetPointProperty()));
                    target.setPointProperty(mergedPointProperty);
                } else {
                    if (pointPropertyShouldBeMergedAndSet == Boolean.FALSE) {
                        target.pointProperty = null;
                    }
                }
            }
            {
                Boolean semiMajorAxisShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetSemiMajorAxis(), rightObject.isSetSemiMajorAxis());
                if (semiMajorAxisShouldBeMergedAndSet == Boolean.TRUE) {
                    LengthType lhsSemiMajorAxis;
                    lhsSemiMajorAxis = leftObject.getSemiMajorAxis();
                    LengthType rhsSemiMajorAxis;
                    rhsSemiMajorAxis = rightObject.getSemiMajorAxis();
                    LengthType mergedSemiMajorAxis = ((LengthType) strategy.merge(LocatorUtils.property(leftLocator, "semiMajorAxis", lhsSemiMajorAxis), LocatorUtils.property(rightLocator, "semiMajorAxis", rhsSemiMajorAxis), lhsSemiMajorAxis, rhsSemiMajorAxis, leftObject.isSetSemiMajorAxis(), rightObject.isSetSemiMajorAxis()));
                    target.setSemiMajorAxis(mergedSemiMajorAxis);
                } else {
                    if (semiMajorAxisShouldBeMergedAndSet == Boolean.FALSE) {
                        target.semiMajorAxis = null;
                    }
                }
            }
            {
                Boolean semiMinorAxisShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetSemiMinorAxis(), rightObject.isSetSemiMinorAxis());
                if (semiMinorAxisShouldBeMergedAndSet == Boolean.TRUE) {
                    LengthType lhsSemiMinorAxis;
                    lhsSemiMinorAxis = leftObject.getSemiMinorAxis();
                    LengthType rhsSemiMinorAxis;
                    rhsSemiMinorAxis = rightObject.getSemiMinorAxis();
                    LengthType mergedSemiMinorAxis = ((LengthType) strategy.merge(LocatorUtils.property(leftLocator, "semiMinorAxis", lhsSemiMinorAxis), LocatorUtils.property(rightLocator, "semiMinorAxis", rhsSemiMinorAxis), lhsSemiMinorAxis, rhsSemiMinorAxis, leftObject.isSetSemiMinorAxis(), rightObject.isSetSemiMinorAxis()));
                    target.setSemiMinorAxis(mergedSemiMinorAxis);
                } else {
                    if (semiMinorAxisShouldBeMergedAndSet == Boolean.FALSE) {
                        target.semiMinorAxis = null;
                    }
                }
            }
            {
                Boolean verticalAxisShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetVerticalAxis(), rightObject.isSetVerticalAxis());
                if (verticalAxisShouldBeMergedAndSet == Boolean.TRUE) {
                    LengthType lhsVerticalAxis;
                    lhsVerticalAxis = leftObject.getVerticalAxis();
                    LengthType rhsVerticalAxis;
                    rhsVerticalAxis = rightObject.getVerticalAxis();
                    LengthType mergedVerticalAxis = ((LengthType) strategy.merge(LocatorUtils.property(leftLocator, "verticalAxis", lhsVerticalAxis), LocatorUtils.property(rightLocator, "verticalAxis", rhsVerticalAxis), lhsVerticalAxis, rhsVerticalAxis, leftObject.isSetVerticalAxis(), rightObject.isSetVerticalAxis()));
                    target.setVerticalAxis(mergedVerticalAxis);
                } else {
                    if (verticalAxisShouldBeMergedAndSet == Boolean.FALSE) {
                        target.verticalAxis = null;
                    }
                }
            }
            {
                Boolean orientationShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetOrientation(), rightObject.isSetOrientation());
                if (orientationShouldBeMergedAndSet == Boolean.TRUE) {
                    AngleType lhsOrientation;
                    lhsOrientation = leftObject.getOrientation();
                    AngleType rhsOrientation;
                    rhsOrientation = rightObject.getOrientation();
                    AngleType mergedOrientation = ((AngleType) strategy.merge(LocatorUtils.property(leftLocator, "orientation", lhsOrientation), LocatorUtils.property(rightLocator, "orientation", rhsOrientation), lhsOrientation, rhsOrientation, leftObject.isSetOrientation(), rightObject.isSetOrientation()));
                    target.setOrientation(mergedOrientation);
                } else {
                    if (orientationShouldBeMergedAndSet == Boolean.FALSE) {
                        target.orientation = null;
                    }
                }
            }
        }
    }

    public EllipsoidType withPos(DirectPositionType value) {
        setPos(value);
        return this;
    }

    public EllipsoidType withPointProperty(PointPropertyType value) {
        setPointProperty(value);
        return this;
    }

    public EllipsoidType withSemiMajorAxis(LengthType value) {
        setSemiMajorAxis(value);
        return this;
    }

    public EllipsoidType withSemiMinorAxis(LengthType value) {
        setSemiMinorAxis(value);
        return this;
    }

    public EllipsoidType withVerticalAxis(LengthType value) {
        setVerticalAxis(value);
        return this;
    }

    public EllipsoidType withOrientation(AngleType value) {
        setOrientation(value);
        return this;
    }

}
