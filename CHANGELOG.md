# CHANGELOG

## 2025-12-04 v0.20.0

- Based on Comet 25.9.8
- Add support for shared quota management APIs
- Add Proxmox API parameter

## 2025-11-14 v0.19.0

- Based on Comet 25.9.6
- Add new API methods for getting, setting, and deleting Protected Items and
their associated schedules
- Add new API methods for live connection credential/session management
- Add JobID field to API response when starting jobs via the dispatcher on
devices running Comet 25.9.6 or newer
- Add support for custom tags on backup jobs to allow grouping of
snapshots/jobs
- Add support SAS Relic codesigning
- Improve documentation for Proxmox API types

## 2025-08-15 v0.18.0

- Based on Comet 25.6.8
- Add support for Proxmox
- Add profile hash to some API endpoints

## 2025-02-17 v0.17.0
Update to 24.12.5

- Based on Comet 24.12.5

## 2025-01-29 v0.16.0

- Based on Comet 24.12.4

## 2025-01-28 v0.15.0

- Based on Comet 24.12.3
- Additional properties for BrandingOptions, BrandingProperties and ServerMetaBrandingProperties

## 2025-01-15 v0.14.0

- Based on Comet 24.12.2
- Support new Login Protection feature
- Support requiring password changes for admin accounts
- Support new user grouping functionality
- Support creating a first admin account on empty servers
- Support vault-device associations and automatic vault creation

## 2024-10-29 v0.13.0

- Based on Comet 24.9.6
- New API AdminDispatcherTestSmbAuth to instruct a device to test Windows SMB credentials
- New RESTORETYPE_WINDISK_VHDX to restore Disk Image backup as Hyper-V VHDX format
- BackupJobDetail supports ConflictingJobID field to indicate conflicting job if a lock error occurred
- BackupJobProgress can report the total number of items for progress visualization
- DiskDrive adds information about parent disks on Linux

## 2024-09-17 v0.12.0

- Based on Comet 24.9.1
- Added Hyper-V Guest limits per user
- Added VMware Guest limits per user
- Added protected item type (engine) to protected item class
- Added Force Overwrite Restore permissions

## 2024-08-01 v0.11.0

- Based on Comet 24.6.6
- Add new AdminConvertStorageRole API
- Update data types for new job retry feature (BackupJobDetail, BackupRuleEventTriggers, and new JOB_STATUS_RUNNING_TRYAGAIN)
- Add support for custom Prefix in S3GenericVirtualStorageRole

## 2024-07-16 v0.10.0

- Based on Comet 24.6.4
- Added Server Device and Booster Limits
- Added API to count devices registered on a Server
- Added Software Build Role configuration per tenant

## 2024-06-11 v0.9.0

- Based on Comet 24.6.0
- Added custom HELO/EHLO STMP support
- Added support to set if disabled Office 365 accounts should be backed up
- Added EngineType as a property of VaultSnapshots

## 2024-05-31 v0.8.0

- Based on Comet 24.5.0
- Added support for matching Microsoft Office 365 users and groups by Drive ID
- Added support for configuring Object Lock on a Impossible Cloud Partner API Storage Template
- Added support for Custom Body Date when using a Custom Remote Bucket Storage Template

## 2024-05-24 v0.7.0

- Based on Comet 24.3.9

## 2024-05-17 v0.6.0

- Based on Comet 24.3.8
- Added support for configuring Software Build Role builder count
- Added LastStartTime field to job statistics

## 2024-05-14 v0.5.0

- Based on Comet 24.3.7
- Added support for configuring concurrency in Microsoft 365 Protected Items
- Normalise formatting

## 2024-05-02 v0.4.0

- Based on Comet 24.3.6
- Testing new release process

## 2024-04-12 v0.3.0

- Based on Comet 24.3.5

## 2024-01-17 v0.2.0

- Based on Comet 23.12.3

## 2023-11-07 v.1.0

Java SDK prepared for upload to Maven Central
- Based on Comet 23.9.8

## 2023-11-06 v0.0.0

- Based on Comet 23.9.8
- Initial version

