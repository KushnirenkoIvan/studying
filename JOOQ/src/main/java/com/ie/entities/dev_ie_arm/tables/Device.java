/**
 * This class is generated by jOOQ
 */
package com.ie.entities.dev_ie_arm.tables;


import com.ie.entities.dev_ie_arm.DevIeArm;
import com.ie.entities.dev_ie_arm.Keys;
import com.ie.entities.dev_ie_arm.tables.records.DeviceRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class Device extends TableImpl<DeviceRecord> {

	private static final long serialVersionUID = -1132338730;

	/**
	 * The reference instance of <code>dev_ie_arm.Device</code>
	 */
	public static final Device DEVICE = new Device();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<DeviceRecord> getRecordType() {
		return DeviceRecord.class;
	}

	/**
	 * The column <code>dev_ie_arm.Device.id</code>.
	 */
	public static final TableField<DeviceRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), DEVICE, "");

	/**
	 * The column <code>dev_ie_arm.Device.changed</code>.
	 */
	public static final TableField<DeviceRecord, Timestamp> CHANGED = createField("changed", org.jooq.impl.SQLDataType.TIMESTAMP, DEVICE, "");

	/**
	 * The column <code>dev_ie_arm.Device.created</code>.
	 */
	public static final TableField<DeviceRecord, Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), DEVICE, "");

	/**
	 * The column <code>dev_ie_arm.Device.idDev</code>.
	 */
	public static final TableField<DeviceRecord, Long> IDDEV = createField("idDev", org.jooq.impl.SQLDataType.BIGINT.nullable(false), DEVICE, "");

	/**
	 * The column <code>dev_ie_arm.Device.status</code>.
	 */
	public static final TableField<DeviceRecord, String> STATUS = createField("status", org.jooq.impl.SQLDataType.VARCHAR.length(14), DEVICE, "");

	/**
	 * The column <code>dev_ie_arm.Device.uniqueKey</code>.
	 */
	public static final TableField<DeviceRecord, String> UNIQUEKEY = createField("uniqueKey", org.jooq.impl.SQLDataType.CHAR.length(40).nullable(false), DEVICE, "");

	/**
	 * The column <code>dev_ie_arm.Device.changedById</code>.
	 */
	public static final TableField<DeviceRecord, Integer> CHANGEDBYID = createField("changedById", org.jooq.impl.SQLDataType.INTEGER, DEVICE, "");

	/**
	 * The column <code>dev_ie_arm.Device.rroId</code>.
	 */
	public static final TableField<DeviceRecord, Integer> RROID = createField("rroId", org.jooq.impl.SQLDataType.INTEGER, DEVICE, "");

	/**
	 * The column <code>dev_ie_arm.Device.idSam</code>.
	 */
	public static final TableField<DeviceRecord, Long> IDSAM = createField("idSam", org.jooq.impl.SQLDataType.BIGINT.nullable(false), DEVICE, "");

	/**
	 * The column <code>dev_ie_arm.Device.changedBy_id</code>.
	 */
	public static final TableField<DeviceRecord, Integer> CHANGEDBY_ID = createField("changedBy_id", org.jooq.impl.SQLDataType.INTEGER, DEVICE, "");

	/**
	 * No further instances allowed
	 */
	private Device() {
		this("Device", null);
	}

	private Device(String alias, Table<DeviceRecord> aliased) {
		this(alias, aliased, null);
	}

	private Device(String alias, Table<DeviceRecord> aliased, Field<?>[] parameters) {
		super(alias, DevIeArm.DEV_IE_ARM, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<DeviceRecord, Long> getIdentity() {
		return Keys.IDENTITY_DEVICE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<DeviceRecord> getPrimaryKey() {
		return Keys.KEY_DEVICE_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<DeviceRecord>> getKeys() {
		return Arrays.<UniqueKey<DeviceRecord>>asList(Keys.KEY_DEVICE_PRIMARY, Keys.KEY_DEVICE_UNIQUEKEY_UNIQUE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<DeviceRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<DeviceRecord, ?>>asList(Keys.DEVICE_RRO_FK);
	}
}
