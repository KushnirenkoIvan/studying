/**
 * This class is generated by jOOQ
 */
package com.ie.entities.dev_ie_arm.tables.records;


import com.ie.entities.dev_ie_arm.tables.Device;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DeviceRecord extends UpdatableRecordImpl<DeviceRecord> implements Record10<Long, Timestamp, Timestamp, Long, String, String, Integer, Integer, Long, Integer> {

	private static final long serialVersionUID = 1320148448;

	/**
	 * Setter for <code>dev_ie_arm.Device.id</code>.
	 */
	public void setId(Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>dev_ie_arm.Device.id</code>.
	 */
	public Long getId() {
		return (Long) getValue(0);
	}

	/**
	 * Setter for <code>dev_ie_arm.Device.changed</code>.
	 */
	public void setChanged(Timestamp value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>dev_ie_arm.Device.changed</code>.
	 */
	public Timestamp getChanged() {
		return (Timestamp) getValue(1);
	}

	/**
	 * Setter for <code>dev_ie_arm.Device.created</code>.
	 */
	public void setCreated(Timestamp value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>dev_ie_arm.Device.created</code>.
	 */
	public Timestamp getCreated() {
		return (Timestamp) getValue(2);
	}

	/**
	 * Setter for <code>dev_ie_arm.Device.idDev</code>.
	 */
	public void setIddev(Long value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>dev_ie_arm.Device.idDev</code>.
	 */
	public Long getIddev() {
		return (Long) getValue(3);
	}

	/**
	 * Setter for <code>dev_ie_arm.Device.status</code>.
	 */
	public void setStatus(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>dev_ie_arm.Device.status</code>.
	 */
	public String getStatus() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>dev_ie_arm.Device.uniqueKey</code>.
	 */
	public void setUniquekey(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>dev_ie_arm.Device.uniqueKey</code>.
	 */
	public String getUniquekey() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>dev_ie_arm.Device.changedById</code>.
	 */
	public void setChangedbyid(Integer value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>dev_ie_arm.Device.changedById</code>.
	 */
	public Integer getChangedbyid() {
		return (Integer) getValue(6);
	}

	/**
	 * Setter for <code>dev_ie_arm.Device.rroId</code>.
	 */
	public void setRroid(Integer value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>dev_ie_arm.Device.rroId</code>.
	 */
	public Integer getRroid() {
		return (Integer) getValue(7);
	}

	/**
	 * Setter for <code>dev_ie_arm.Device.idSam</code>.
	 */
	public void setIdsam(Long value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>dev_ie_arm.Device.idSam</code>.
	 */
	public Long getIdsam() {
		return (Long) getValue(8);
	}

	/**
	 * Setter for <code>dev_ie_arm.Device.changedBy_id</code>.
	 */
	public void setChangedbyId(Integer value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>dev_ie_arm.Device.changedBy_id</code>.
	 */
	public Integer getChangedbyId() {
		return (Integer) getValue(9);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Long> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record10 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row10<Long, Timestamp, Timestamp, Long, String, String, Integer, Integer, Long, Integer> fieldsRow() {
		return (Row10) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row10<Long, Timestamp, Timestamp, Long, String, String, Integer, Integer, Long, Integer> valuesRow() {
		return (Row10) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field1() {
		return Device.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field2() {
		return Device.CHANGED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field3() {
		return Device.CREATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field4() {
		return Device.IDDEV;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return Device.STATUS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return Device.UNIQUEKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field7() {
		return Device.CHANGEDBYID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field8() {
		return Device.RROID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field9() {
		return Device.IDSAM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field10() {
		return Device.CHANGEDBY_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value2() {
		return getChanged();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value3() {
		return getCreated();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value4() {
		return getIddev();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getStatus();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getUniquekey();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value7() {
		return getChangedbyid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value8() {
		return getRroid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value9() {
		return getIdsam();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value10() {
		return getChangedbyId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DeviceRecord value1(Long value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DeviceRecord value2(Timestamp value) {
		setChanged(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DeviceRecord value3(Timestamp value) {
		setCreated(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DeviceRecord value4(Long value) {
		setIddev(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DeviceRecord value5(String value) {
		setStatus(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DeviceRecord value6(String value) {
		setUniquekey(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DeviceRecord value7(Integer value) {
		setChangedbyid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DeviceRecord value8(Integer value) {
		setRroid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DeviceRecord value9(Long value) {
		setIdsam(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DeviceRecord value10(Integer value) {
		setChangedbyId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DeviceRecord values(Long value1, Timestamp value2, Timestamp value3, Long value4, String value5, String value6, Integer value7, Integer value8, Long value9, Integer value10) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		value9(value9);
		value10(value10);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached DeviceRecord
	 */
	public DeviceRecord() {
		super(Device.DEVICE);
	}

	/**
	 * Create a detached, initialised DeviceRecord
	 */
	public DeviceRecord(Long id, Timestamp changed, Timestamp created, Long iddev, String status, String uniquekey, Integer changedbyid, Integer rroid, Long idsam, Integer changedbyId) {
		super(Device.DEVICE);

		setValue(0, id);
		setValue(1, changed);
		setValue(2, created);
		setValue(3, iddev);
		setValue(4, status);
		setValue(5, uniquekey);
		setValue(6, changedbyid);
		setValue(7, rroid);
		setValue(8, idsam);
		setValue(9, changedbyId);
	}
}
