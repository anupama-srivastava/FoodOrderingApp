# Food Ordering App - Setup Guide

## Prerequisites

- **Android Studio**: Arctic Fox (2020.3.1) or later
- **Android SDK**: API 21+ (Android 5.0+)
- **Java**: JDK 8 or later
- **Firebase Account**: Required for authentication and database
- **Google Play Services**: For location and maps

## Initial Setup

### 1. Clone the Repository
```bash
git clone [repository-url]
cd FoodOrderingApp
```

### 2. Firebase Setup

1. **Create Firebase Project**:
   - Go to [Firebase Console](https://console.firebase.google.com/)
   - Create a new project named "FoodOrderingApp"
   - Enable Authentication, Firestore, Storage, and Cloud Messaging

2. **Download Configuration**:
   - Go to Project Settings → General
   - Download `google-services.json`
   - Place it in `app/` directory

3. **Enable Authentication Methods**:
   - Email/Password
   - Google Sign-In
   - Facebook Sign-In (optional)

### 3. API Keys Setup

1. **Google Maps API**:
   - Go to [Google Cloud Console](https://console.cloud.google.com/)
   - Enable Maps SDK for Android
   - Create API key and add to `strings.xml`

2. **Razorpay Setup**:
   - Create account at [Razorpay](https://razorpay.com/)
   - Get API keys from Dashboard
   - Add to `strings.xml`

### 4. Build Configuration

1. **Update Build Files**:
   - Sync project with Gradle files
   - Update package name if needed
   - Update version codes

2. **Dependencies Installation**:
   ```bash
   ./gradlew build
   ```

### 5. Database Structure

The Firestore database should have the following collections:

#### Users Collection
```
users/{userId}
- name: string
- email: string
- phone: string
- profileImage: string
- addresses: array
- favoriteRestaurants: array
- createdAt: timestamp
- updatedAt: timestamp
```

#### Restaurants Collection
```
restaurants/{restaurantId}
- name: string
- description: string
- image: string
- rating: number
- deliveryTime: string
- deliveryFee: number
- minOrder: number
- cuisines: array
- address: string
- latitude: number
- longitude: number
- isOpen: boolean
- categories: array
- createdAt: timestamp
- updatedAt: timestamp
```

#### Orders Collection
```
orders/{orderId}
- userId: string
- restaurantId: string
- items: array
- subtotal: number
- deliveryFee: number
- tax: number
- discount: number
- total: number
- deliveryAddress: object
- paymentMethod: string
- orderStatus: string
- createdAt: timestamp
- updatedAt: timestamp
```

### 6. Run Configuration

1. **Create Run Configuration**:
   - Open Android Studio
   - Select app module
   - Choose target device (emulator or physical)

2. **Build Variants**:
   - Debug: For development
   - Release: For production

### 7. Testing Setup

1. **Unit Tests**:
   ```bash
   ./gradlew test
   ```

2. **Integration Tests**:
   ```bash
   ./gradlew connectedAndroidTest
   ```

3. **UI Tests**:
   ```bash
   ./gradlew connectedCheck
   ```

## Development Workflow

### 1. Feature Development
- Create feature branch from `develop`
- Implement feature with tests
- Create pull request
- Code review and merge

### 2. Testing
- Unit tests for business logic
- Integration tests for database operations
- UI tests for critical user flows
- Manual testing on devices

### 3. Deployment
- Internal testing via Firebase App Distribution
- Beta testing via Google Play Console
- Production release with staged rollout

## Project Structure

```
FoodOrderingApp/
├── app/
│   ├── src/main/java/com/foodorderingapp/
│   │   ├── data/
│   │   │   ├── local/
│   │   │   ├── remote/
│   │   │   └── repository/
│   │   ├── domain/
│   │   │   ├── model/
│   │   │   ├── repository/
│   │   │   └── usecase/
│   │   ├── presentation/
│   │   │   ├── adapter/
│   │   │   ├── ui/
│   │   │   └── viewmodel/
│   │   └── di/
│   ├── src/main/res/
│   │   ├── layout/
│   │   ├── drawable/
│   │   ├── values/
│   │   └── navigation/
│   └── build.gradle
├── build.gradle
├── settings.gradle
└── README.md
```

## Key Features Implementation

### 1. Authentication
- Firebase Auth with email/password
- Social login (Google, Facebook)
- Secure token management

### 2. Restaurant Discovery
- Real-time restaurant listings
- Location-based filtering
- Search and sort functionality

### 3. Cart Management
- Persistent cart storage
- Real-time price updates
- Promo code application

### 4. Order Management
- Real-time order tracking
- Push notifications
- Order history

### 5. Payment Integration
- Multiple payment methods
- Secure payment processing
- Transaction history

## Performance Optimization

### 1. Image Loading
- Glide for efficient image loading
- Image caching strategies
- Lazy loading for lists

### 2. Database Optimization
- Room for local storage
- Firestore for real-time data
- Query optimization

### 3. Network Optimization
- Retrofit with OkHttp
- Request/response caching
- Error handling

## Security Features

### 1. Data Protection
- SSL pinning for API calls
- Encrypted shared preferences
- ProGuard code obfuscation

### 2. User Privacy
- GDPR compliance
- Data encryption at rest
- Secure authentication

## Monitoring and Analytics

### 1. Firebase Analytics
- User behavior tracking
- Conversion tracking
- A/B testing support

### 2. Crash Reporting
- Firebase Crashlytics
- Real-time crash alerts
- Performance monitoring

## Troubleshooting

### Common Issues

1. **Build Failures**:
   - Check Firebase configuration
   - Verify API keys
   - Update dependencies

2. **Runtime Errors**:
   - Check permissions
   - Verify network connectivity
   - Check Firebase rules

3. **Performance Issues**:
   - Profile with Android Studio
   - Check memory usage
   - Optimize queries

## Support

For issues and questions:
- Check the [Issues](https://github.com/your-repo/issues) page
- Review [Documentation](https://github.com/your-repo/wiki)
- Contact support@foodorderingapp.com
